<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="eggs"%>

<c:url var="baseUrl" value="/" />

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="eggs app">
<meta name="author" content="Kiss, Benedek">

<title>Eggs Webapp</title>

<!-- Bootstrap core CSS -->
<!-- slate,united,yeti,simplex,readable,amelia,cerulean,cosmo,cyborg,flatly,journal  -->
<!-- <link href="http://netdna.bootstrapcdn.com/bootswatch/3.0.2/united/bootstrap.min.css" rel="stylesheet"> -->
<link
    href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/css/bootstrap.min.css"
    rel="stylesheet" />

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
  <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
  <![endif]-->
</head>

<body>
    <header class="navbar navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container">
                <div class="pull-left">
                    <a class="brand" role="button" href="${baseUrl}home.jsp"> Eggs
                    </a>
                </div>
                <div class="nav-collapse">
                    <ul class="nav">
                        <li><a href="${baseUrl}csak.jsp">Chuck Norris</a></li>
                        <li><a href="${baseUrl}breaktime.jsp">breaks</a></li>
                        <li><a href="${baseUrl}users.jsp">users</a></li>
                        <li><a href="${baseUrl}setAddress.jsp">address</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </header>

    <div style="margin: 45px;"></div>

    <div class="container">
        <div class="row">