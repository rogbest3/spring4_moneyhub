"use strict"
var auth = auth || {};
auth = (()=>{
	let _, js;
	let init =()=>{
		_ = $.ctx();
		js = $.js();
	}
	let onCreate =()=>{
		init();
	//	$('#a_go_join').on('click', ()=>{
		$('#a_go_join').click(()=>{
			alert('회원가입 클릭');
		});
	}
	return{onCreate : onCreate}	// app에서 auth.onCreate() 호출했기 때문에 return에 onCreate 사용
})();