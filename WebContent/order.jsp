

<table class="table table-striped">
	<thead>
		<tr>
			<th>Food</th>
			<th>Price</th>
			<th>Restaurant</th>
			<th>Order</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${menuRepo.menus}" var="menu">
			<c:forEach items="${menu.foodList}" var="food">
				<tr>
					<td>${food.name}</td>
					<td>${food.price}</td>
					<td>${menu.restaurant.name}</td>
					<c:url value="addToCart" var="addToCartURL">
						<c:param name="foodId" value="${food.id}"></c:param>
					</c:url>
					<td><a href="${addToCartURL}" class="btn btn-success"> <i
							class="icon icon-white icon-plus"></i>
					</a></td>
				</tr>
			</c:forEach>
		</c:forEach>
	</tbody>
</table>