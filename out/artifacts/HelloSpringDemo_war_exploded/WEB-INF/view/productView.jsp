<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/view/template/header.jsp"%>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Product Detail</h1>

            <p class="lead">Here is the detail information of the product!</p>
        </div>

        <div class="container">
            <div class="row">
                <div class="col-md-5">
                    <img src="#" alt="image" style="width:100%; height: 300px" />
                </div>

                <div class="col-md-5">
                    <h3>${product.prodName}</h3>
                    <p>${product.prodDescription}</p>
                    <p>
                        <strong>Manufacturer</strong> : ${product.prodManufacturer}
                    </p>
                    <p>
                        <strong>Category</strong> : ${product.prodCategory}
                    </p>
                    <p>
                        <strong>Condition</strong> : ${product.prodCondition}
                    </p>
                    <h4>${product.prodPrice} USD</h4>
                </div>
            </div>
        </div>



<%@include file="/WEB-INF/view/template/footer.jsp" %>