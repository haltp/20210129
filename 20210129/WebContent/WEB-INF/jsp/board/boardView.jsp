<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../main/menu.jsp" />

<script type="text/javascript">
	function deleteAlert() {
		var yn = confirm("정말 삭제하시겠습니까?");
		if (yn) {
			frm.action = "boardDelete.do";
			frm.submit();
		}
	}
</script>
</head>
<body>
	<div class="w3-content" style="max-width: 2000px; margin-top: 46px"
		align="center">
		<div>
			<h1>게시글</h1>
		</div>
		<table border="1">
			<tr>
				<th width="100">작성자</th>
				<td width="120" align="center">${vo.bName }</td>
				<th width="100">작성일자</th>
				<td width="120" align="center">${vo.bDate }</td>
				<th width="100">조회수</th>
				<td width="100" align="center">${vo.bHit }</td>
			</tr>
			<tr>
				<th width="50">제 목</th>
				<td colspan="5">${vo.bTitle }</td>
			</tr>
			<tr>
				<th width="50">내용</th>
				<td colspan="5"><textarea id="bcontent" name="bcontent"
						rows="7" cols="90">${vo.bContent }</textarea></td>
			</tr>
		</table>
		<br />
		<div>
			<c:if test="${not empty rrlist }">
				<c:forEach var="rvo" items="${rrlist }">
					<table border="1">
						<tr>
							<td width="500">${rvo.subJect }</td>
							<td width="100">${rvo.rDate }</td>
						</tr>
					</table>
				</c:forEach>
			</c:if>
		</div>
		<div>
			<button type="button"
				onclick="location.href='boardUpdateForm.do?bId1=${vo.bId }'">수정</button>
			&nbsp;&nbsp;
			<button type="button" onclick="deleteAlert()">삭제</button>
			&nbsp;&nbsp;
			<button type="button" onclick="location.href='boardList.do'">목록</button>
		</div>
	</div>
	<div>
		<form id="frm" name="frm" method="post">
			<input type="hidden" id="bId" name="bId" value="${vo.bId}">
		</form>
	</div>
</body>
</html>