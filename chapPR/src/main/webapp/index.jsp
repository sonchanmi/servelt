<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 주문화면 만들기
</head>
<body>
    <h1> 햄버거 주문화면입니다. </h1>
    <form action="querystring" method="get" >
 <label> 메뉴</label>
<select name= "menu">
  <option value= "불고기버거" >불고기버거</option>
  <option value= "chicken">치킨버거</option>
  <option value="crm"> 새우버거</option> 
 </select> <br>
 <label>수량 : </lable><input type="number" name="num"><br>
 <label>가격 : </lable><input type="text" name="price"><br>
 
<input type="submit" value="주문하기"> 
</form>
</body>
</html>