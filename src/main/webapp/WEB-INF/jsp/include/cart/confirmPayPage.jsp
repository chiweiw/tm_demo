<%--
  Created by IntelliJ IDEA.
  User: the_one
  Date: 2018/5/18
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%--显示订单的创建时间，付款时间和发货时间，以及订单号，收款人信息等--%>
<%--遍历订单项集合，显示其中的产品图片，产品标题，价格，数量，小计，总结信息--%>
<%--最后提供确认支付按钮，提交到/foreorderconfirmed路径--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<div class="confirmPayPageDiv">
    <div class="confirmPayImageDiv">
        <img src="img/site/comformPayFlow.png">
        <div  class="confirmPayTime1">
            <fmt:formatDate value="${o.createDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
        </div>
        <div  class="confirmPayTime2">
            <fmt:formatDate value="${o.payDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
        </div>
        <div class="confirmPayTime3">
            yyyy-MM-dd HH:mm:ss
        </div>

    </div>
    <div class="confirmPayOrderInfoDiv">
        <div class="confirmPayOrderInfoText">我已收到货，同意支付宝付款</div>
    </div>
    <div class="confirmPayOrderItemDiv">
        <div class="confirmPayOrderItemText">订单信息</div>
        <table class="confirmPayOrderItemTable">
            <thead>
            <th colspan="2">宝贝</th>
            <th width="120px">单价</th>
            <th width="120px">数量</th>
            <th width="120px">商品总价 </th>
            <th width="120px">运费</th>
            </thead>
            <c:forEach items="${o.orderItems}" var="oi">
                <tr>
                    <td><img width="50px" src="img/productSingle_middle/${oi.product.firstProductImage.id}.jpg"></td>
                    <td class="confirmPayOrderItemProductLink">
                        <a href="#nowhere">${oi.product.name}</a>
                    </td>
                    <td>￥<fmt:formatNumber type="number" value="${oi.product.originalPrice}" minFractionDigits="2"/></td>
                    <td>1</td>
                    <td><span class="conformPayProductPrice">￥<fmt:formatNumber type="number" value="${oi.product.promotePrice}" minFractionDigits="2"/></span></td>
                    <td><span>快递 ： 0.00 </span></td>
                </tr>
            </c:forEach>
        </table>

        <div class="confirmPayOrderItemText pull-right">
            实付款： <span class="confirmPayOrderItemSumPrice">￥<fmt:formatNumber type="number" value="${o.total}" minFractionDigits="2"/></span>
        </div>

    </div>
    <div class="confirmPayOrderDetailDiv">

        <table class="confirmPayOrderDetailTable">
            <tr>
                <td>订单编号：</td>
                <td>${o.orderCode} <img width="23px" src="img/site/confirmOrderTmall.png"></td>
            </tr>
            <tr>
                <td>卖家昵称：</td>
                <td>天猫商铺 <span class="confirmPayOrderDetailWangWangGif"></span></td>
            </tr>
            <tr>
                <td>收货信息： </td>
                <td>${o.address}，${o.receiver}， ${o.mobile}，${o.post} </td>
            </tr>
            <tr>
                <td>成交时间：</td>
                <td><fmt:formatDate value="${o.createDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
            </tr>
        </table>

    </div>
    <div class="confirmPayButtonDiv">
        <div class="confirmPayWarning">请收到货后，再确认收货！否则您可能钱货两空！</div>
        <a href="foreorderConfirmed?oid=${o.id}"><button class="confirmPayButton">确认支付</button></a>
    </div>
</div>