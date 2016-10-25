<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>美容院信息列表</title>
</head>
<body>

	<!-- 页面显示部分 -->
    <div>
        <div>
            <div>
                <h2>美容院列表</h2>
            </div>
            <div>
                <table border="1">
                    <thead>
                        <tr>
                            <th>美容院名称</th>
                            <th>美容院地址</th>
                            <th>美容院联系人</th>
                            <th>美容院联系电话</th>
                            <th>美容院联系人的微信名</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="salon" items="${list}">
                            <tr>
                                <td>${salon.salonName}</td>
                                <td>${salon.salonAddress}</td>
                                <td>${salon.contacts}</td>
                                <td>${salon.contactPhone}</td>
                                <td>${salon.contactsWechatName}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    
</body>
</html>