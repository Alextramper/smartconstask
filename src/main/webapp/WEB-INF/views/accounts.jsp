<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Список счетов</title>
    <style>

        .list{
            position: relative;
            margin-left: 118px;
            bottom: 950px;
            width: 65%;
            padding-top: 20px;
            background-color: rgba(250, 235, 215, .9);
            font-family: Arial, sans-serif;
            text-align: center;
            border:5px solid rgba(255, 140, 0, .2);
            letter-spacing: 0.05em;
        }


        .listtable {
            width:100%;
            align-items: center;
            padding: 30px;
            margin: 0 auto;
        }

        .tablehead {
            font-size: 20px;
            padding:40px;
            font-family: Impact, sans-serif;
        }

        .trhead {
            padding: 40px;
        }


        .b {
            font-size: 15px;


        }
        .b td {
            text-transform: none;
            padding: 14px;
        }


        .addBtn {
            position: absolute;
            left: 1150px;
            bottom: 600px;
            width:150px;
            color: #000000;
            border: 2px solid darkcyan;
            padding: 15px;
            cursor: pointer;
            background: linear-gradient(0.50turn, rgba(192, 192, 192, .4),
            rgba(192, 192, 192, .9),rgba(219, 192, 192, .4));
            letter-spacing: 0.07em;

        }

        .tdDel{
            font-size: 17px;
            text-decoration: none;
            font-family: Impact, sans-serif;
            color:rgba(0, 0, 205, .7);
        }
        .tdDel:hover {
            color: rgba(0, 0, 205, .9);
        }

    </style>
</head>
<body>
<jsp:include page="home.jsp"/>
<div class="list">
    <table class="listtable">
        <span class="tablehead">Список счетов</span>
        <tr class="trhead">
            <th>ID счета</th>
            <th>ID клиента</th>
            <th>Номер счета</th>
            <th>Сумма на счете</th>
            <th></th>
        </tr>
        <c:forEach items="${accountList}"  var="accounts">
            <tr class="b">
                <td>${accounts.id}</td>
                <td>${accounts.clientId}</td>
                <td>${accounts.accountNumber}</td>
                <td>${accounts.sum}</td>
                <td class="tdDel" >
                    <spring:url value="${accounts.id}" var="deleteAcc"/>
                    <a href="${deleteAcc}">Удалить</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
<a class="addBtn" style="margin: 0 auto; text-decoration: none" href="../accounts/acform">Добавить счет</a>
</body>
</html>

