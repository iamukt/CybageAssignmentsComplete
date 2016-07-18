mkdir mydir
cd mydir
mydir>npm init

npm install gulp --save-dev

npm install gulp-connect --save-dev

npm install gulp-ruby-sass --save-dev

gulpfile.js


var gulp = require('gulp')
var sass = require('gulp-ruby-sass')
var connect = require('gulp-connect')

gulp.task('connect', function () {
	connect.server({
		root: 'public',
		port: 4000
	})
})


<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>My App</title>
</head>
<body>
	<h1>It works!</h1>
</body>
</html>


gulp connect



var gulp = require('gulp')
var sass = require('gulp-ruby-sass')
var connect = require('gulp-connect')

gulp.task('connect', function () {
	connect.server({
		root: 'public',
		port: 4000
	})
})


app/app.js

require('angular')

var app = angular.module('app', [])

app.controller('MainController', function($scope) {
	$scope.message = 'Angular Works!'
})

npm install --save-dev browserify

npm install --save-dev vinyl-source-stream

var browserify = require('browserify')
var source = require('vinyl-source-stream')


gulp.task('browserify', function() {
	// Grabs the app.js file
    return browserify('./app/app.js')
    	// bundles it and creates a file called main.js
        .bundle()
        .pipe(source('main.js'))
        // saves it the public/js/ directory
        .pipe(gulp.dest('./public/js/'));
})

npm install --save-dev angular
npm install --save-dev angular

<!DOCTYPE html>
<html lang="en" ng-app="app">
<head>
	<meta charset="UTF-8">
	<title>My App</title>
	<script src="/js/main.js"></script>
</head>
<body>
	<div ng-controller="MainController">
		<h1>{{message}}</h1>
	</div>
</body>
</html>  

gulp browserify






