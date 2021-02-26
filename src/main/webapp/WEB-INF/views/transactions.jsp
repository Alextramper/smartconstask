<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Система</title>
    <style>

        .list{
            position: relative;
            margin-left: 118px;
            bottom: 950px;
            width: 75%;
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
            font-size: 15px;
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
            left: 1345px;
            bottom: 618px;
            width:170px;
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
            <span class="tablehead">Список транзакций</span>
            <tr class="trhead">
                <th>Индекс транзакции</th>
                <th>Номер транзакции</th>
                <th>Номер счета отправителя</th>
                <th>Номер счета получателя</th>
                <th>Сумма</th>
                <th colspan="2"></th>
            </tr>
            <c:forEach items="${transactiontList}"  var="transaction">
                <tr class="b">
                    <td>${transaction.id}</td>
                    <td>${transaction.fromAccount}</td>
                    <td>${transaction.targetAccount}</td>
                    <td>${transaction.sum}</td>
                    <td>${transaction.sum}</td>
                    <td>
                        <spring:url value="${transaction.id}" var="deleteTrans"/>
                        <a class="tdDel" href="${deleteTrans}">Удалить запись</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
<a class="addBtn" style="margin: 0 auto; text-decoration: none" href="../transactions/trform">Выполнить перевод</a>
</body>
</html>