/**
 * 
 */
function trim(str){
	var reg = new RegExp(" ","gim");
	return str.replace(reg,"");
}
