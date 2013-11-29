    </div>
    <footer>
        <p>&copy; MySuperWonderfulCompany 2013</p>
    </footer>
    </div>
    <!-- /container -->
    
    <c:if test="${not empty param.debug }">
        <eggs:debug title="session" map="${sessionScope }" />
        <eggs:debug title="application" map="${applicationScope }" />
        <eggs:debug title="headers" map="${header }" />
    </c:if>
</body>
</html>