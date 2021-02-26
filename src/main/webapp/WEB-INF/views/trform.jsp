<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .content {
            transition-duration: 0.5s;
            background: url("/images/addform.jpg");
            letter-spacing: 0.06em;
            border: 2px solid darkblue;
            width: 1920px;
            height: 1080px;
            margin: 0;
            -webkit-filter: blur(5px);

        }

        .wrap {
            margin: 0 auto;
            position:relative;
            bottom: 870px;
            width: 20%;
            height: 60%;
            font-size: 18px;
            border: 2px solid rgba(0, 100, 0, .4);
            background: linear-gradient(0.35turn, rgba(255, 248, 220, .6),
            rgba(192, 192, 192, .6),rgba(210, 105, 30, .6));
        }

        .form {
            color: black;
            left: 20px;
            margin: 0 auto;
            display: block;
            padding: 20px;
            -webkit-filter: blur(0px);
        }

        .form input {
            display: block;
            width:100%;
            border: none;
            height: 25px;
            margin: 10px 0;
        }
        .submit {
            background-color:rgba(0, 100, 0, .5);
            cursor:pointer;
        }

    </style>
</head>
<body>
<div class = content></div>

<div class="wrap" align="center">
    <form class="form" action="" method="post">
       <label>Перевод средств</label><br><br>

        <label>Cо счета №: </label>
        <input type="email" name="username">

        <label>На счет №:</label>
        <input type="text" name="password">

        <input class="submit" type="submit" value="Submit">
    </form>
</div>

</body>
</html>
