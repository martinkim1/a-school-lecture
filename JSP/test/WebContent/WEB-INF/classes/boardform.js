function deletecheck() {
	if ( document.boardform.passwd.value=="" ) {
		alert("암호를 입력해 주세요.");
		document.boardform.passwd.focus();
		return;
	}		

	ok = confirm("삭제하시겠습니까?");
	if (ok) {
		document.boardform.menu.value='delete';
		document.boardform.submit();
	} else {
		return;
	}			
}

function insertcheck() {
	if ( document.boardform.name.value=="" ) {
		alert("이름을 입력해 주세요.");
		document.boardform.name.focus();
		return;
	}
	if ( document.boardform.passwd.value=="" ) {
		alert("암호를 입력해 주세요.");
		document.boardform.passwd.focus();
		return;
	}
	document.boardform.menu.value='insert';
	document.boardform.submit();
}

function updatecheck() {
	if ( document.boardform.name.value=="" ) {
		alert("이름을 입력해 주세요.");
		document.boardform.name.focus();
		return;
	}
	if ( document.boardform.passwd.value=="" ) {
		alert("암호를 입력해 주세요.");
		document.boardform.passwd.focus();
		return;
	}
	document.boardform.menu.value='update';
	document.boardform.submit();			
}
