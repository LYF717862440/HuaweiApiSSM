Date.prototype.format = function(format) {
	var o = {
		"M+": this.getMonth() + 1,
		"d+": this.getDate(),
		"h+": this.getHours(),
		"m+": this.getMinutes(),
		"s+": this.getSeconds(),
		"q+": Math.floor((this.getMonth() + 3) / 3),
		"S": this.getMilliseconds()
	}
	if(/(y+)/.test(format)) {
		format = format.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
	}
	for(var k in o) {
		if(new RegExp("(" + k + ")").test(format)) {
			format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length));
		}
	}
	return format;
};

var getFormateDateByLong = function(longtime) {
	var date = new Date();
	date.setTime(longtime);
	//return date.format("yyyy-MM-dd hh:mm:ss");
	//return date.format("yyyy-MM-dd");
	return date.format("yyyy年MM月dd日");
};
var getLongTimeByStr = function(datestr) {
	var date = new Date(datestr.replace("-", "/").replace("-", "/"));
	return date.getTime();
};