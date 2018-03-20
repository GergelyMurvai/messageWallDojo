<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c"       uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"     uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn"      uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Messages</title>
</head>
<body>
<style>
    div.form {
        width: 80%;
        margin: 5px auto;
        border: solid 1px rgba(0,0,0,.4);
    }
    div.form form {
        width: 100%;
        margin: 0;
        padding: 5px 0;
        text-align: center;
    }
    div.form form input, div.form form label {
        width: 80%;
        margin: 5px auto;
        display: block;
        padding: 5px 0;
        border: solid 1px #336699;
    }
    div.messagewall {
        width: 80%;
        margin: 0 auto;
        text-align: center;
    }
    div.messagewall h1 {
        width: 100%;
        background: #333;
        color: #fff;
    }
    div.messagewall ul {
        width: 100%;
        margin: 0 auto;
        padding: 0;
        display: flex;
        flex-wrap: wrap;
    }
    div.messagewall ul li {
        width: 40%;
        margin: 5px auto;
        padding: 5px 0;
        border: solid 1px #333;
        color: gray;
    }
</style>
<div class="form">
    <form action="wall" method="post">
        <label for="username">your name:</label>
        <input type="text" name="username">
        <label for="message">your message:</label>
        <input type="text" name="content">
        <button type="submit">send message</button>
    </form>
</div>
<div class="messagewall">
    <h1>messages</h1>
    <ul>
        <c:forEach items = "${messages}" var ="msg">
        <li>
            <span>${msg.user}</span>
            <p>${msg.content}</p>
        </li>
        </c:forEach>
    </ul>
</div>
</body>
</html>
