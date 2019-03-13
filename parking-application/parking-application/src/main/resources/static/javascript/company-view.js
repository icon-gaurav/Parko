function reqVService() {
    var ctx = document.getElementById("requestChart");
    var chart = new Chart(ctx, {
	// The type of chart we want to create
	type : 'line',

	// The data for our dataset
	data : {
	    labels : [ "January", "February", "March", "April", "May", "June",
		    "July" ],
	    datasets : [ {
		label : "My First dataset",
		backgroundColor : 'rgb(255, 99, 132)',
		borderColor : 'rgb(255, 99, 0)',
		data : [ 0, 10, 5, 2, 20, 30, 45 ],
	    } ]
	},
	options : {}
    });

}

function revenue() {
    var ctx = document.getElementById("revenueChart");
    var chart = new Chart(ctx, {
	// The type of chart we want to create
	type : 'bar',

	// The data for our dataset
	data : {
	    labels : [ "January", "February", "March", "April", "May", "June",
		    "July" ],
	    datasets : [ {
		label : "My First dataset",
		backgroundColor : 'rgb(255, 99, 132)',
		borderColor : 'rgb(255, 99, 0)',
		data : [ 0, 10, 5, 2, 20, 30, 45 ],
	    } ]
	},
	options : {}
    });
}

function customerSatisfaction() {
    var ctx = document.getElementById("satisfactionChart");
    var chart = new Chart(ctx, {
	// The type of chart we want to create
	type : 'pie',

	// The data for our dataset
	data : {
	    labels : [ "January", "February", "March", "April", "May", "June",
		    "July" ],
	    datasets : [ {
		label : "My First dataset",
		backgroundColor : 'rgb(255, 99, 132)',
		borderColor : 'rgb(255, 99, 0)',
		data : [ 0, 10, 5, 2, 20, 30, 45 ],
	    } ]
	},
	options : {}
    });
}

function retention() {
    var ctx = document.getElementById("retentionChart");
    var chart = new Chart(ctx, {
	// The type of chart we want to create
	type : 'line',

	// The data for our dataset
	data : {
	    labels : [ "January", "February", "March", "April", "May", "June",
		    "July" ],
	    datasets : [ {
		label : "My First dataset",
		backgroundColor : 'rgb(255, 99, 132)',
		borderColor : 'rgb(255, 99, 0)',
		data : [ 0, 10, 5, 2, 20, 30, 45 ],
	    } ]
	},
	options : {}
    });
}

function costPerSupport() {
    var ctx = document.getElementById("costChart");
    var chart = new Chart(ctx, {
	// The type of chart we want to create
	type : 'line',

	// The data for our dataset
	data : {
	    labels : [ "January", "February", "March", "April", "May", "June",
		    "July" ],
	    datasets : [ {
		label : "My First dataset",
		backgroundColor : 'rgb(255, 99, 132)',
		borderColor : 'rgb(255, 99, 0)',
		data : [ 0, 10, 5, 2, 20, 30, 45 ],
	    } ]
	},
	options : {}
    });
}

function responseChart() {
    var ctx = document.getElementById("responseTimeChart");
    var chart = new Chart(ctx, {
	// The type of chart we want to create
	type : 'bar',

	// The data for our dataset
	data : {
	    labels : [ "January", "February", "March", "April", "May", "June",
		    "July" ],
	    datasets : [ {
		label : "My First dataset",
		backgroundColor : 'rgb(255, 99, 132)',
		borderColor : 'rgb(255, 99, 0)',
		data : [ 0, 10, 5, 2, 20, 30, 45 ],
	    } ]
	},
	options : {}
    });
}
// load every chart in the dashboard
function loadChart() {
    reqVService();
    revenue();
    customerSatisfaction();
    retention();
    costPerSupport();
    responseChart();
}