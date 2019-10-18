"use strict"
var auth = auth || {};
auth =(()=>{
	const WHEN_ERR = '호출하는 JS 파일을 찾지 못했습니다.';
	let _, js, auth_vuejs;
	let init =()=>{
		_ = $.ctx()
		js = $.js()
		auth_vuejs = js + '/vue/auth_vue.js'
	}
	let onCreate =()=>{
		init()
		$.getScript(auth_vuejs).done(()=>{
			setContentView()
			$('#a_go_join').click(e=>{
				e.preventDefault()
				join()
			})
			
		}).fail(()=>{alert(WHEN_ERR)})
	}
	let setContentView =()=>{
		login()
	}
	let join =()=>{
    	$('head').html( auth_vue.join_head() )
		$('body').html( auth_vue.join_body() ) 
		$('<button>', {
			text : '회원가입',	//	값을 주면 세터가 됨.
			href : '#',
//			type : 'submit',
			click : e=>{
				e.preventDefault();	//	form tag 무력화시킴 form은 SOAP방식이기 때문에 AJAX 안먹힘
				let data = { uid : $('#userid').val(), pwd : $('#password').val()}
				alert('전송아이디 : '+ data.uid );
				$.ajax({
					url : _+'/user/join',
					type : 'POST',
					dataType : 'json',
					data : JSON.stringify(data),
					contentType : 'application/json',
					success : d => {	// sender, d가 자바에서 map, d.uid map의 키값
						alert('AJAX 성공 아이디 : '+ d.uid + ', 성공 비번 : ' + d.pwd);
						login()
						
					},	
					error : e => {		// receiver, 
						alert('AJAX 실패');
					}		
				})
			}
		})
		.addClass('btn btn-primary btn-lg btn-block')
    	.appendTo('#join_btn')	    		    	


	}
	let login =()=>{
		let x = { css:$.css(), img:$.img() }
		$('head')
		.html( auth_vue.login_head(x) )
		$('body')
		.addClass('text-center')
		.html( auth_vue.login_body(x) )
		//<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
		$('<button>', {
			type : 'submit',
			text : 'Sign in',
			click : e=>{
				e.preventDefault()
				let data = { uid : $('#uid').val(), pwd : $('#pwd').val()}
				$.ajax({
					url : _+'/user/login',
					type : 'POST',
					dataType : 'json',
					data : JSON.stringify(data),
					contentType : 'application/json',
					success : d =>{
						alert('AJAX 로그인 성공 아이디: '+d.uid + ', 비번 : ' + d.pwd)
						
						
					},
					error : e=>{
						alert('AJAX 실패')
					}
						
				})
			}
		})
		.addClass('btn btn-lg btn-primary btn-block')
		.appendTo('#btn_login')
	}
	return{onCreate : onCreate, join, login}	// app에서 auth.onCreate() 호출했기 때문에 return에 onCreate 사용
})();