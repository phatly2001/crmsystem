<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/header.jspf" %>
	<section class="content">
		<div class="container my-3">
			<div class="row p-3">
				<div class="welcome">
					<h2>Welcome, Ly Hung Phat!</h2>
				</div>
				<div class="date-block">
					<div class="navbar navbar-expand-lg navbar-light">
						<script>
                           let date = new Date();
                           date.toLocaleDateString();
                           document.write(date);
                        </script>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-3">
					<div class="card shadow p-3 rounded ">
						<div class="card-body ">
							<div class="row align-items-center">
								<div class="col-9">
									<h4>Customers</h4>
								</div>
								<div class="col-3">
									<i class="bi bi-people-fill "
										style="font-size: 40px; color: #d87e70;"></i>
								</div>
							</div>

						</div>
						<span class="mx-4 p-0" style="font-size: 40px">500</span>
					</div>
				</div>
				<div class="col-3">
					<div class="card shadow p-3 rounded ">
						<div class="card-body ">
							<div class="row align-items-center">
								<div class="col-9">
									<h4>Sales</h4>
								</div>
								<div class="col-3 ">
									<i class="bi bi-wallet"
										style="font-size: 40px; color: #d87e70;"></i>
								</div>
							</div>

						</div>
						<span class="mx-4 p-0" style="font-size: 40px">14999 $</span>
					</div>
				</div>
				<div class="col-3">
					<div class="card shadow p-3 rounded ">
						<div class="card-body  ">
							<div class="row align-items-center">
								<div class="col-9">
									<h4>Employees</h4>
								</div>
								<div class="col-3">
									<i class="bi bi-person-badge "
										style="font-size: 40px; color: #d87e70;"></i>
								</div>
							</div>

						</div>
						<span class="mx-4 p-0" style="font-size: 40px">100</span>
					</div>
				</div>
				<div class="col-3">
					<div class="card shadow p-3 rounded ">
						<div class="card-body ">
							<div class="row align-items-center">
								<div class="col-9">
									<h4>Orders</h4>
								</div>
								<div class="col-3">
									<i class="bi bi-receipt "
										style="font-size: 40px; color: #d87e70;"></i>
								</div>
							</div>

						</div>
						<span class="mx-4 p-0" style="font-size: 40px">500</span>
					</div>
				</div>
			</div>
			<div class="row my-3">
				<div class="col-6">
					<div class="card rounded shadow p-3">
						<canvas id="myChart"></canvas>
					</div>

				</div>
				<div class="col-6">
					<div class="card rounded shadow p-3">
						<canvas id="chart-line"></canvas>
					</div>

				</div>
			</div>

			<div class="row my-3">
				<div class="col-12">
					<div class="card rounded shadow p-3  ">
						<table class="myTable  ">
							<div class="row p-3 align-content-center">
								<div class="col-4">
									<div class="logo" style="font-size: 25px !important">List
										of users</div>
								</div>
								<div class="col-4">
									<div class="search-block position-relative ">
										<input class="form-control rounded "
											style="padding-left: 35px;" type="search"
											placeholder="Search.." aria-label="Search"> <i
											class="bi bi-search"
											style="position: relative; top: -32px; left: 10px;"></i>
									</div>
								</div>
								<div class="col-4">
									<div class="search-block ">
										<a href="#" class=" btn myBtn rounded float-end"> <i
											class="bi bi-plus-circle-dotted"></i> New
										</a>
									</div>
								</div>
							</div>
							<div class="row p-2 ">
								<div class="filter-block d-flex ">
									<div class="show-block me-2">
										<label> Show </label> <select name="" id="">
											<option value="All">All Users</option>
										</select>
									</div>
									<div class="sort-block">
										<label> Sort By </label> <select name="" id="">
											<option value="Ascending">Ascending</option>
											<option value="Descending">Descending</option>
										</select>
									</div>
								</div>
							</div>
							<thead>
								<tr>
									<th scope="col">No.</th>
									<th scope="col">Full Name</th>
									<th scope="col">D.O.B</th>
									<th scope="col">Status</th>
									<th scope="col"></th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>1</td>
									<td>Mark</td>
									<td>Otto</td>
									<td><span class="badge" style="background-color: #d87093">Ready</span></td>
									<td><a href="#"> <small> Edit </small></a> <a href="#">
											<small> Delete </small>
									</a></td>
								</tr>
								<tr>
									<td>2</td>
									<td>Mark</td>
									<td>Otto</td>
									<td><span class="badge" style="background-color: #974e76">Processing</span></td>
									<td><a href="#"> <small> Edit </small></a> <a href="#">
											<small> Delete </small>
									</a></td>
								</tr>
								<tr>
									<td>3</td>
									<td>Mark</td>
									<td>Otto</td>
									<td><span class="badge" style="background-color: #d87e70">Done</span></td>
									<td><a href="#"> <small> Edit </small></a> <a href="#">
											<small> Delete </small>
									</a></td>
								</tr>

							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</section>
	<%@include file="../common/footer.jspf" %>
	