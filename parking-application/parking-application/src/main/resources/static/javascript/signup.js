function checkBoxClick() {
    var checkbox = document.getElementById("T&C");
    var submitButton = document.getElementById("register");
    if (checkbox.checked == true) {
	submitButton.disabled = false;
    } else {
	submitButton.disabled = true;
    }
}

function passwordMatch() {
    var pass = document.getElementById("pass").value;
    var cnfpass = document.getElementById("cnfpass").value;
    if (pass == "") {
	// password is empty
	return false;
    } else if (pass != cnfpass) {
	// password didn't match
	return false;
    } else {
	// password matched
	return true;
    }
}

function emailCheck() {
    var pattern = "[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$";
    var email = document.getElementById("email").value;
    if (email.match(pattern)) {
	return true;
    } else {
	return false;
    }
}

function usernameCheck() {
    return true;
}

function vehicleCheck() {
    var vehicle = document.getElementById("vehicle-no").value;
    if (vehicle == "")
	return false;
    else
	return true;
}

function formValidation() {
    var msgDiv = document.getElementById("msg_div");
    var vehicle_msg = document.getElementById("vehicle_msg");
    var email_msg = document.getElementById("email_msg");
    var user_msg = document.getElementById("user_msg");
    var pass_msg = document.getElementById("password_msg");
    var msg_header = document.getElementById("msg_header");
    var flag = false;

    if (!vehicleCheck()) {
	vehicle_msg.className = "valid";
	flag = true;
    }
    if (!emailCheck()) {
	email_msg.className = "valid";
	flag = true;
    }
    if (!usernameCheck()) {
	user_msg.className = "valid";
	flag = true;
    }
    if (!passwordMatch()) {
	pass_msg.className = "valid";
	flag = true;
    }
    if (flag == true) {
	msgDiv.className = "valid";
	msg_header.className = "valid";
    }
    return !flag;
}