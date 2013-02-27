$(function(){
	var totalPage = $("#totalPage").val();
	var currentPage = $("#currentPage").val();
	if(currentPage == totalPage) {
		hideNextBtn();
	}
	if(currentPage == 1) {
		hidePreBtn();
	}
	
});
function hideNextBtn() {
	$("#J-nextGroup").hide();
}
function hidePreBtn() {
	$("#J-preGroup").hide();
}
$(window).scroll(function() {
	var t = $(document).scrollTop();
	if (t >= 300) {
		showGoToTop();
	} else {
		hideGoToTop();
	}
});
function showGoToTop() {
	$("#J-goToTop").css("right", "22px");
	$("#J-nextGroup").css("right", "87px");
	$("#J-preGroup").css("right", "152px");
}
function hideGoToTop() {
	$("#J-goToTop").css("right", "-45px");
	$("#J-nextGroup").css("right", "20px");
	$("#J-preGroup").css("right", "85px");
}
function goToTop() {
	$('body,html').animate({
		scrollTop : 0
	}, 1000);
}