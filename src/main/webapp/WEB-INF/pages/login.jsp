<%--
  Created by IntelliJ IDEA.
  User: rayed
  Date: 10/25/16
  Time: 12:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/templates/header.jsp"%>
    <div class="container">
        <div class="page-header">
            <h1>Welcome to Meal Planner</h1>
        </div>
        <form class="form-signin" action="/usr/homepage" method="POST">
            <h2 class="form-signin-heading">Please log in</h2>
            <label for="inputEmail" class="sr-only">Email address</label>
            <input type="email" id="inputEmail" name="inputEmail" class="form-control" placeholder="Email address" required autofocus>
            <label for="inputPassword" class="sr-only">Password</label>
            <input type="password" id="inputPassword" name="inputPassword" class="form-control" placeholder="Password" required>
            <div class="checkbox">
                <label>
                    <input type="checkbox" value="remember-me"> Remember me
                </label>
            </div>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Log in</button>
            <br>
            <div class="center-block">
                <a href="/auth/signup">Sign up?</a>
            </div>
        </form>
    </div> <!-- /container -->
<%@include file="/templates/footer.jsp"%>