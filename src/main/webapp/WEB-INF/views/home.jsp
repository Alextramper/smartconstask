<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Система</title>
    <style>
        body {
            padding: 0;
            margin: 0;
            font-family: Impact, sans-serif;
            text-transform: uppercase;

        }

        .header {
            background: url(../../images/header.jpg);
            letter-spacing: 0.05em;
            height: 1080px;
            padding-top: 130px;

            position: relative;

        }

        .mainpage {
            position: fixed;
            left: 1530px;
            top: 130px;
            font-size: 20px;
            padding: 30px;
            text-align: end;
            border: 3px solid rgba(255, 255, 0, .5);
            color: #000000;
        }
        .mainpage:hover {
            background: linear-gradient(0.50turn, rgba(224, 255, 255, .4),
            rgba(0, 191, 255, .2),rgba(224, 255, 255, .4));
            color: black;

        }


        .mainpage a {
            padding: 10px;
            background-color: rgba(135, 206, 250, .05);
            text-decoration: none;
            font-size: 20px;
            color: #8B008B;
        }

        .container {
            margin: 220px;
            height: 1000px;
            width: 1000px;



        }

        .nav {
            position: fixed;
            display: flex;
            width: 1410px;
            align-items: center;
            background: linear-gradient(0.50turn, rgba(255, 255, 224, .2),
            rgba(255, 255, 0, .4),rgba(255, 255, 224, .1));
        }

        .menu {
            display: flex;
            list-style-type: none;
            padding: 10px;

        }

        .menu li a {
            margin: 22px;
            padding: 10px;
            text-decoration: none;
            font-size: 19px;


        }
        .menu li a:hover {
            background: linear-gradient(0.50turn, rgba(255, 255, 224, .05),
            rgba(255, 255, 0, .15),rgba(255, 255, 224, .05));
        }
    </style>
</head>
<body>
<header class="header">
    <div class = "mainpage">
        <a href="/">
            Главная страница
        </a>
    </div>
        <div class="container" style="width: 1670px; margin: 0 auto">
            <div class="nav" >
                <img src="/images/logo.jpg" style="width: 120px; margin-right: 60px" alt="logo">
                <ui class="menu">
                    <li>
                         <a href ="../clients" >
                             Список клиентов
                          </a>
                    </li>
                    <li>
                        <a href="../accounts">
                            Список счетов
                         </a>
                     </li>
                     <li>
                         <a href="transactions">
                            Список транзакций
                         </a>
                     </li>
                 </ui>
            </div>
         </div>
</header>
</body>
</html>