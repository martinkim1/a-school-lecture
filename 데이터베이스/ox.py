import random

# QuizQuestion 클래스 정의
class QuizQuestion:
    def __init__(self, number, statement, answer):
        self.number = number
        self.statement = statement
        self.answer = answer

    def ask_question(self):
        print(f"{self.number}. {self.statement} (O/X)")
        user_answer = input("Enter 'O' or 'X': ").upper()
        return check_answer(user_answer, self.answer)

# check_answer 함수 정의
def check_answer(user_answer, correct_answer):
    if user_answer == correct_answer:
        print("정답!\n")
        return True
    else:
        print("오답!\n")
        return False

# 문제 순서를 랜덤으로 섞기
def shuffle_questions(questions):
    random.shuffle(questions)

# 오답 노트 실행
def execute_review(incorrect_indices, questions):
    print("문제를 다 풀었습니다. 오답노트를 실행합니다.")
    for index in incorrect_indices:
        question = questions[index]
        print(f"({question.number}) {question.statement} 정답: {question.answer}")
        while not question.ask_question():
            pass

# 나머지 문제에 대한 객체 생성
questions = [
    QuizQuestion(1, "정보는 수집된 그대로의 정량적 혹은 실제값을 말한다.", 'X'),
    QuizQuestion(2, "각 사용자 관점에 따라 특정 정보는 또 다른 누군가에게는 데이터가 될 수 있다.", 'O'),
    QuizQuestion(3, "기업 전반의 운영 및 관리 정보를 통합 지원하는 정보 시스템은 전사적자원관리시스템이다.", 'O'),
    QuizQuestion(4, "파일 처리의 근본적 문제는 데이터 종속성과 데이터 중복성 문제이다.", 'O'),
    QuizQuestion(5, "데이터베이스의 주요 특성인 통합은 여러 장소에 흩어져 있더라도 상호 연결되어 접근할 수 있는 논리적 통합보다는 한 곳으로 모으는 물리적 통합을 뜻한다.", 'X'),
    QuizQuestion(6, "데이터베이스 사용자는 초급 사용자, 중급 사용자, 응용 프로그래머 3가지 사용자 유형으로 분류할 수 있다.", 'X'),
    QuizQuestion(7, "스키마는 데이터베이스의 정적인 구성뿐만 아니라 동적인 유지 조건까지를 포함한다.", 'O'),
    QuizQuestion(8, "각 사용자별로 외부에서 바라보는 관점은 다양하므로 데이터베이스 하나에 여러 개의 외부 스키마가 존재할 수 있다.", 'O'),
    QuizQuestion(9, "데이터 사전에 저장된 데이터는 한 차원 높은 데이터라는 의미에서 메타 데이터라고 한다.", 'O'),
    QuizQuestion(10, "DBMS는 3단계 데이터베이스 구조의 스키마 간의 적절한 사상을 통하여 데이터 독립성을 지원한다.", 'O'),
    QuizQuestion(11, "데이터 구조는 표현하려고 하는 데이터의 정적 측면을, 데이터 연산은 데이터의 동적 측면을 명세한다.", 'O'),
    QuizQuestion(12, "관계형 데이터 모델은 이롡거으로는 릴레이션이라는 수학적 집합 개념에 기초하고 있다.", 'O'),
    QuizQuestion(13, "속성 이름이 다르더라도 도메인이 같다면 속성들의 값 비교가 가능하여 의미적으로도 옳다.", 'O'),
    QuizQuestion(14, "속성이 없는 릴레이션은 존재할 수 있지만 투플이 없는 릴레이션은 존재할 수 없다.", 'X'),
    QuizQuestion(15, "투플들의 순서만 다른 두 릴레이션은 같은 릴레이션이 된다.", 'O'),
    QuizQuestion(16, "릴레이션은 다중 값 속성은 허용하나 복합 속성은 허용하지 않는다.", 'X'),
    QuizQuestion(17, "모든 릴레이션은 최소한 하나 이상의 후보키를 가진다.", 'O'),
    QuizQuestion(18, "외래키는 널 값을 가질 수 있다.", 'X'),
    QuizQuestion(19, "외래키와 참조하는 기본키 사이에는 속성 이름과 대응하는 속성들의 수가 같고 도메인은 서로 일치해야 한다.", 'O'),
    QuizQuestion(20, "관계 대수는 릴레이션을 내부적으로 처리하기 위한 연산들의 집합으로 비절차적이다.", 'X'),
    QuizQuestion(21, "합집합, 교집합, 차집합은 두 릴레이션이 서로 합병 가능해야 한다.", 'O'),
    QuizQuestion(22, "합집합 연산을 적용한 결과 릴레이션 안의 중복된 투플이 있다면 자동으로 제거된다.", 'O'),
    QuizQuestion(23, "R1-R2의 카디널리티는 R1보다 같거나 작다.", 'O'),
    QuizQuestion(24, "셀렉트는 릴레이션에서 특정 투플을 추출하는 연산으로 릴레이션을 수평 분할하는 효과를 가져온다.", 'O'),
    QuizQuestion(25, "조인 R1_R2가 반환하는 결과 릴레이션은 카티션 프로덕트의 결과 릴레이션 중에 소셜 셀렉트한 것과 같다.", 'O'),
    QuizQuestion(26, "세타 조인은 동등 조인 결과 중에서 조인 조건에 사용된 중복 속성을 자동 제거한 조인이다.", 'X'),
    QuizQuestion(27, "SELECT절과 FROM절은 반드시 명세해야 하는 필수절이며 나머지 절들은 생략 가능하다.", 'O'),
    QuizQuestion(28, "검색 결과에서 중복을 제거하기 위하여 ‘SELECT DISTINCT 나이, DISTINCT 학년 FROM 학생’처럼 명세한다.", 'X'),
    QuizQuestion(29, "원칙적으로 ORDER BY절이나 GROUP BY절 정렬(그룹핑) 기준으로 명세한 열은 SELECT절에도 명세해야 한다.", 'O'),
    QuizQuestion(30, "COUNT(*)는 중복 행도 개수에 포함한다.", 'O'),
    QuizQuestion(31, "집계 함수는 WHERE절에는 사용할 수 없지만 HAVING절에는 사용 가능하다.", 'O'),
    QuizQuestion(32, "WHERE절의 LIKE 'g_d'는 열 값으로 godm good, gd 등을 갖는 행들을 검색한다.", 'X'),
    QuizQuestion(33, "NULL이 포함된 행은 대부분의 집계 함수의 결과에서 제외된다.", 'O'),
    QuizQuestion(34, "부 질의문은 보통 WHERE절에 사용되지만 SELECT, FROM 절에도 사용 가능하다.", 'O'),
    QuizQuestion(35, "'WITH GRANT OPTION'을 함께 명세하면 부여받은 권한을 계정 사용자가 다른 사용자 계정에게도 부여할 수 있는 권한을 갖게 된다.", 'O'),
    QuizQuestion(36, "DROP TABLE문은 행 삭제를 위한 명령문으로 모든 행 삭제까지는 가능하지만 테이블 자체를 제거할 수 없는 반면, DELETE FROM 명령문은 테이블 자체를 삭제한다.", 'X'),
    QuizQuestion(37, "뷰는 물리적 기반 테이블로부터만 정의될 수 있고 또 다른 뷰를 기반으로는 정의될 수 없다.", 'X'),
    QuizQuestion(38, "뷰는 데이터는 직접 갖지 않지만 검색할 경우, 항상 실시간 정확한 데이터 값을 제공한다.", 'O'),
    QuizQuestion(39, "GROUP BY절을 적용한 검색 결과를 포함하는 뷰를 통해서는 데이터 변경이 불가능하다.", 'O'),
    QuizQuestion(40, "인덱스를 많이 사용한다고 검색 성능이 무조건 좋아지지는 않는다.", 'O'),
    QuizQuestion(41, "저장 프로시저와 트리거는 SQL문을 포함하지만 사용자 정의 함수는 SQL문 안에 포함된다.", 'O'),
    QuizQuestion(42, "트랜잭션 수행 중에는 일시적으로 일관성이 지켜지지 않을 수 있다.", 'O'),
    QuizQuestion(43, "트랜잭션의 원자성, 지속성 특성은 DBMS의 회복 기법에 의해 지원된다.", 'O'),
    QuizQuestion(44, "수동완료 트랜잭션 모드에서 CREATE문을 실행하면 트랜잭션이 자동으로 시작된다.", 'X'),
    QuizQuestion(45, "데이터에 대한 모든 공유 락이 해제된 이후에만 독점 락을 설정할 수 있다.", 'O'),
    QuizQuestion(46, "고립화 수준이 높아질수록 동시 접근성도 높아진다.", 'X'),
]

# 문제 순서 섞기
shuffle_questions(questions)

# 틀린 문제 인덱스 저장
incorrect_indices = []

# 모든 문제에 대한 퀴즈 실행
for question in questions:
    if not question.ask_question():
        incorrect_indices.append(question.number - 1)  # 인덱스는 0부터 시작

# 오답 노트 실행
execute_review(incorrect_indices, questions)

# 모든 문제를 맞출 때까지 반복
while incorrect_indices:
    shuffle_questions(incorrect_indices)
    new_incorrect_indices = []
    for index in incorrect_indices:
        question = questions[index]
        if not question.ask_question():
            new_incorrect_indices.append(index)
    incorrect_indices = new_incorrect_indices

# 모든 문제를 맞춘 경우
print("모든 문제를 정답으로 풀었습니다. 프로그램을 종료합니다.")
