<div class="main-content">
				<!-- #section:basics/content.breadcrumbs -->
				<div class="breadcrumbs" id="breadcrumbs">
					<script type="text/javascript">
						try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
					</script>

					<ul class="breadcrumb">
						<li>
							<i class="ace-icon fa fa-home home-icon"></i>
							<a href="${rootURL}">Home</a>
						</li>

						<li>
							<a href="#">Items</a>
						</li>
						<li class="active">Add Item </li>
					</ul><!-- /.breadcrumb -->

					<!-- #section:basics/content.searchbox -->
					<div class="nav-search" id="nav-search">
						<form class="form-search">
							<span class="input-icon">
								<input type="text" placeholder="Search ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
								<i class="ace-icon fa fa-search nav-search-icon"></i>
							</span>
						</form>
					</div><!-- /.nav-search -->

					<!-- /section:basics/content.searchbox -->
				</div>

				<!-- /section:basics/content.breadcrumbs -->
				<div class="page-content">
					<!-- /section:settings.box -->
					<div class="page-content-area">
						<div class="row">
							<div class="col-xs-6">
								<!-- PAGE CONTENT BEGINS -->

								<div class="widget-box">
									<div class="widget-header widget-header-blue widget-header-flat">
										<h4 class="widget-title lighter">Add New Item</h4>
									</div>
									<div class="widget-body">
										<div class="widget-main">
											
											<!-- #section:plugins/fuelux.wizard.container -->
											<div class="step-content pos-rel" id="step-container">
												<div class="step-pane active" id="step1">
													<h3 class="lighter block green">Enter the following information</h3>

													<form class="form-horizontal" id="create-item" action="/" method="post">
														<!-- #section:elements.form.input-state -->
														<div class="form-group">
															<label for="inputWarning" class="col-xs-12 col-sm-3 control-label no-padding-right">Device Name</label>

															<div class="col-xs-12 col-sm-5">
																<span class="block input-icon input-icon-right">
																	<input type="text" id="inputWarning" class="input-xxlarge" />
																</span>
															</div>
														</div>
														
														<div class="form-group">
															<label for="inputWarning" class="col-xs-12 col-sm-3 control-label no-padding-right">Device Name</label>

															<div class="col-xs-12 col-sm-5">
																<div class="input-group">
																	<input class="form-control date-picker input-xlarge" id="id-date-picker-1" type="text" data-date-format="dd-mm-yyyy" />
																	<span class="input-group-addon">
																		<i class="fa fa-calendar bigger-110"></i>
																	</span>
																</div>
															</div>
														</div>

														<div class="form-group">
															<label for="inputSuccess" class="col-xs-12 col-sm-3 control-label no-padding-right">Input with success</label>
															<div class="col-xs-12 col-sm-5">
																<span class="block input-icon input-icon-right">
																	<input type="text" id="inputSuccess" class="input-xxlarge" />
																</span>
															</div>
														</div>

														<div class="form-group">
															<label for="inputInfo" class="col-xs-12 col-sm-3 control-label no-padding-right">Input with info</label>

															<div class="col-xs-12 col-sm-5">
																<span class="block input-icon input-icon-right">
																	<input type="text" id="inputInfo" class="input-xxlarge" />
																</span>
															</div>
														</div>

														<div class="form-group">
															<label for="inputError2" class="col-xs-12 col-sm-3 control-label no-padding-right">Input with error</label>

															<div class="col-xs-12 col-sm-5">
																<span class="input-icon block">
																	<input type="text" id="inputError2" class="input-xxlarge" />
																</span>
															</div>
														</div>
													</form>
								
												</div>
											</div>

											<!-- /section:plugins/fuelux.wizard.container -->
											<hr />
											<div class="wizard-actions">
												<!-- #section:plugins/fuelux.wizard.buttons -->
												<button type="submit" id="createItem" class="btn btn-success btn-next" data-last="Finish">
													Create
												</button>
												<!-- /section:plugins/fuelux.wizard.buttons -->
											</div>

											<!-- /section:plugins/fuelux.wizard -->
										</div><!-- /.widget-main -->
									</div><!-- /.widget-body -->
								</div>
								</div><!-- PAGE CONTENT ENDS -->
							</div><!-- /.col -->
							<!-- PAGE CONTENT ENDS -->
							</div><!-- /.col -->
						</div><!-- /.row -->
						</div><!-- /.row -->
					