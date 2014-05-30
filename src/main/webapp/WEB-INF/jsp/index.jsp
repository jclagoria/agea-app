<%@ include file="common/header.jsp" %>

	<div class="link">
		<h2>Seleccione un sistema</h2>
		
		<table id="tableSistemas" >
			<form:form method="POST" commandName="sistema">  
			
				<tr>
					<td>
						<form:select path="idSistema" >
							<form:options  items="${listaSistemas}" itemLabel="descripcionSistema" itemValue="idSistema" />
						</form:select>
					</td>	
				</tr>
				<tr>
					<td>	
						<button type="submit" id="jsonOption">JSON</button>
					</td>
				</tr>
				<tr>
					<td>	
						<form:textarea id="areaTexto" path="textoFormateado" cols="10" rows="10" disabled="true"/>		
					</td>
				</tr>
			
			</form:form>
		</table>	
		
		
	</div>

<script type="text/javascript">

	$(function() {
		$("#jsonOption").click(function(event) {
			$("areaTexto").val('');
			$("#sistema").attr("action", "/agea/jsonAction")
			$("#sistema").submit();

		});
	});
</script>

<%@ include file="common/footer.jsp" %>
