<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="../main/menu.jsp" />

<!-- Page content -->
<div class="w3-content" style="max-width: 2000px; margin-top: 46px"
	align="center">
	<div align="center">
		<h1>게시글 수정</h1>
		<div>
			<form id="frm" name="frm" action="boardUpdate.do?bId22=${vo.bId }" method="post">
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
						<td colspan="5"><textarea id="bcCntent" name="bContent"
						rows="7" cols="90">${vo.bContent }</textarea></td>
					</tr>
				</table>
				<br />
				<div>
					<button type="submit">저장하기</button>
					&nbsp;&nbsp;
					<button type="reset">취소</button>
					&nbsp;&nbsp;
				</div>
			</form>
		</div>
	</div>
</div>
</body>
</html>