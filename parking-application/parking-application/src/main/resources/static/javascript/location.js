function initMap() {
    if (navigator.geolocation) {
	navigator.geolocation.watchPosition(showPosition);
    } else {
	alert("Geolocation is not supported by this browser.");
    }
}

function showPosition(position) {
    var latitude = position.coords.latitude;
    var longitude = position.coords.longitude;
    var map = new google.maps.Map(document.getElementById('map'), {
	center : {
	    lat : latitude,
	    lng : longitude
	},
	zoom : 3
    });
    var latLng = new google.maps.LatLng(latitude, longitude);
    var marker = new google.maps.Marker({
	position : latLng,
	title : 'You are here',
	map : map,
	draggable : true
    });
}