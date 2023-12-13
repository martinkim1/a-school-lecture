
<h1>30. 커밋 취소 revert</h1>
<hr>
<h2>1. 커밋 취소 revert의 개념</h2>
<p>특정 커밋을 취소하고 이전 상태로 되돌리는 방법. reset과 달리 새로운 커밋이 생성되며, 이전 커밋 이력은 유지됩니다. 'Nothing to commit, working tree clean' 상태에서 수행 가능합니다.</p>
<hr>
<h2>2. revert 명령어 사용</h2>
<p><code>git revert HEAD</code> 명령어를 사용하여 최신 커밋을 취소하고, <code>git revert [commit_ID]</code> 명령어로 특정 커밋을 취소합니다.</p>
<hr>
<h2>3. 옵션 --no-edit</h2>
<p>옵션 <code>--no-edit</code>을 사용하면 'Revert "이전 커밋 메시지"' 형식으로 자동으로 새 커밋 메시지가 생성됩니다. 이를 통해 새로운 커밋을 간편하게 생성할 수 있습니다.</p>
<hr>
<h2>4. revert 충돌과 해결</h2>
<p>HEAD 이전의 커밋을 취소할 경우 충돌이 발생할 수 있습니다. 충돌 해결을 위해 파일을 수정하고 <code>git add file</code>, <code>git revert --continue</code> 명령어를 사용합니다.</p>
<hr>
<h2>5. revert와 reset 비교</h2>
<p>reset은 지정된 이전 커밋으로 이동하고 그 이후의 로그를 제거합니다. 반면, revert는 특정 커밋을 취소하는 새로운 커밋을 생성하며 이전 이력은 그대로 남습니다.</p>
