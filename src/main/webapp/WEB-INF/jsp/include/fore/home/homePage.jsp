<%--
  Created by IntelliJ IDEA.
  User: the_one
  Date: 2018/5/17
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>

<%--1. categoryAndcarousel.jsp--%>
<%--分类和轮播--%>
<%--1.1 categoryMenu.jsp--%>
<%--竖状分类菜单--%>
<%--1.2 productsAsideCategorys.jsp--%>
<%--竖状分类菜单右侧的推荐产品列表--%>
<%--1.3 carousel.jsp--%>
<%--轮播--%>
<%--2. homepageCategoryProducts.jsp--%>
<%--总体17种分类以及每种分类对应的5个产品--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<title>模仿天猫官网</title>

<div class="homepageDiv">
    <%@include file="categoryAndcarousel.jsp"%>
    <%@include file="homepageCategoryProducts.jsp"%>
</div>