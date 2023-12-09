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
def execute_review(incorrect_questions):
    print("문제를 다 풀었습니다. 오답노트를 실행합니다.")
    for question in incorrect_questions:
        print(f"({question.number}) {question.statement} 정답: {question.answer}")
        while not question.ask_question():
            pass

# 중간고사와 기말고사 문제를 구분
questions1 = [
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
    QuizQuestion(12, "관계형 데이터 모델은 이론적으로는 릴레이션이라는 수학적 집합 개념에 기초하고 있다.", 'O'),
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
    QuizQuestion(46, "고립화 수준이 높아질수록 동시 접근성도 높아진다.", 'X')
]

questions2 = [
    QuizQuestion(47, "SELECT 문으로 검색할 경우에는 어떤 이상 현상도 발생하지 않는다.", 'O'),
    QuizQuestion(48, "이상 현상의 주원인은 릴레이션 안의 불필요한 데이터 중복 때문이다.", 'O'),
    QuizQuestion(49, "릴레이션의 기본키 또는 후보키 속성에 대해 나머지 속성들은 모두 함수 종속이다.", 'O'),
    QuizQuestion(50, "함수 종속성은 현재 릴레이션에 저장된 속성 값만을 기준으로 엄격하게 판단해야한다.", 'X'),
    QuizQuestion(51, "보이스코드 정규형은 강한 제3정규형이라고도 한다.", 'O'),
    QuizQuestion(52, "모든 릴레이션은 반드시 제5정규형까지 분해해야 한다.", 'X'),
    QuizQuestion(53, "E-R 모델은 논리적 모델링에 사용되는 대표적 모델이다.", 'X'),
    QuizQuestion(54, "사람, 사물, 장소 등의 물리적 존재와는 다르게 추상적 개념은 개체에 해당하지 않는다.", 'X'),
    QuizQuestion(55, "E-R 다이어그램은 정확하게 말하면 개체 집합과 관계 타입을 그래픽 기호로 표현하는 것이다.", 'X'),
    QuizQuestion(56, "E-R 다이어그램에서 관계도 속성을 가질 수 있다.", 'O'),
    QuizQuestion(57, "E-R 다이어그램에서 관계는 개체 없이는 존재할 수 없는 종속적 존재이다.", 'O'),
    QuizQuestion(58, "E-R 다이어그램에서 단일 실선으로 연결된 관계는 부분 참여 또는 선택적 참여를 의미한다.", 'O'),
    QuizQuestion(59, "데이터베이스 모델링은 분석을, 데이터베이스 설계는 구현에 초점을 맞춘 것이다.", 'O'),
    QuizQuestion(60, "E-R 다이어그램을 작성하기 위한 가장 중요한 요소는 관계이다.", 'X'),
    QuizQuestion(61, "관계는 적어도 둘 이상의 개체를 대상으로 연관성을 갖는다.", 'O'),
    QuizQuestion(62, "속성은 실세계에서 종속적 존재이므로 반드시 상위 개념이 필요하다.", 'O'),
    QuizQuestion(63, "E-R 다이어그램의 개체는 기본적으로 하나의 독립된 릴레이션으로 변환된다.", 'O'),
    QuizQuestion(64, "E-R 다이어그램에서 다중값 속성은 하나의 릴레이션으로 분리하여 변환된다.", 'O'),
    QuizQuestion(65, "ER-win 모델링 도구에서는 논리적 모델링과 물리적 모델링의 작업 내용을 서로 연계하여 두 작업 과정을 상호 전환하면서 진행할 수 있다.", 'X'),
    QuizQuestion(66, "ER-win에서 식별 관계는 관계선을 점선으로 표시하며 약 엔터티는 둥근 사각형으로 구별된다.", 'X'),
    QuizQuestion(67, "ER-win에서 엔터티를 표현하는 사각형 안의 위쪽 영역에는 기본키에 해당하는 키 속성을 입력한다.", 'O'),
    QuizQuestion(68, "데이터웨어하우스는 즉각적인 업무 처리를 위한 OLTP환경을 지원하는 데이터 저장소이다.", 'X'),
    QuizQuestion(69, "데이터웨어하우스는 이질적인 데이터들의 추출, 변환, 통합 과정을 통해 구축된 거대한 분석 전용 데이터 창고라고 할 수 있다.", 'O'),
    QuizQuestion(70, "관계형 데이터베이스는 데이터 큐브의 개념을, 다차원 데이터베이스는 스타 스키마등의 개념을 이용하여 다차원 모델링을 한다.", 'X'),
    QuizQuestion(71, "다차원 데이터베이스는 다차원 큐브 구조로 모델링한다.", 'O'),
    QuizQuestion(72, "스타 스키마는 거대한 크기의 여러 사실 테이블이 작은 하나의 차원 테이블을 일대다의 참조 관계로 연결하는 모양이다.", 'X'),
    QuizQuestion(73, "스타 스키마 구조를 스노우플레이크 스키마 구조로 변환할 수 있다.", 'O'),
    QuizQuestion(74, "다차원 모델링 수행시 보통 응답 시간이 빠르고 구조가 단순하여 이해하기 쉽기 때문에 스타 스키마를 많이 사용한다.", 'O'),
    QuizQuestion(75, "전사적 데이터웨어하우스처럼 대용량 데이터 분석은 관계형 OLAP이 적합하다. 부서 내부의 복잡한 추세 분석은 다차원 OLAP이 적절하다.", 'O'),
    QuizQuestion(76, "객체지향 데이터베이스는 ‘객체’라는 같은 개념으로 응용 프로그램 개발과 데이터 저장을 일관되게 할 수 있어 데이터 유형 불일치 문제를 해결한다.", 'O'),
    QuizQuestion(77, "하둡은 빅데이터 기술에서 가장 중요한 요소로 빅데이터 생태계의 중심이 되고 있다.", 'O'),
    QuizQuestion(78, "보통 정형 데이터는 SQL 데이터베이스에 저장하고 반정형 데이터는 SQL 데이터베이스 또는 NoSQL 데이터베이스를 사용한다.", 'O'),
    QuizQuestion(79, "처리 속도나 저장 용량 등을 고려한다면 무조건적으로 NoSQL로 변경하는 것이 바람직하다.", 'X'),
    QuizQuestion(80, "키-값 데이터베이스는 NoSQL 데이터베이스 중 가장 간단하고 기본적인 형태 이다.", 'O'),
    QuizQuestion(81, "장바구니 분석, 의사결정나무, 신경망 모델, 시계열 분석 등이 모두 예측에 사용되는 기법들이다.", 'O'),
    QuizQuestion(82, "몽고DB는 대표적 비관계형 DBMS로서 개발이 쉽고 유연하며 확장성이 높다.", 'O'),
    QuizQuestion(83, "몽고DB는 JSON 형식의 문서를 사용하지만 데이터베이스 저장시에는 이진 포맷으로 인코딩한 BSON 형식의 문서로 변환되어 저장된다.", 'O'),
    QuizQuestion(84, "몽고DB는 별도의 스키마 선언 없이도 릴레이션에 해당하는 컬렉션을 생성할 수 있다.", 'O'),
    QuizQuestion(85, "몽고DB 쉘에 접속하기 위해서는 우선 mongod 인스턴스가 실행되어야 한다.", 'O'),
    QuizQuestion(86, "find( ) 명령어 함수 뒤의 pretty( ) 명령어 함수는 배열과 내장 문서와 같이 복잡한 계층 문서들의 내용을 정돈해서 보기 쉽도록 표시해준다.", 'O'),
    QuizQuestion(87, "findOne( ) 명령어 함수는 커서 객체를 반환하며 여러 문서를 검색 결과를 통해 얻고자 할 경우 사용하며 커서를 활용하여 문서 처리 작업을 반복한다.", 'X'),
    QuizQuestion(88, "updateOne( ), updateMany( ) 명령어 함수는 특정 필드값을 바꾸거나 필드 이름을 변경, 또는 필드를 삭제하는 등의 문서 수정을 수행한다.", 'O'),
    QuizQuestion(89, "replacOne( ) 명령어 함수는 문서 변경이 아니라 교체이기 때문에 기존 문서 내용은 전부 사라지지만 문서 고유의 값인 _‘id’ 필드값은 바뀌지 않는다.", 'O'),
    QuizQuestion(90, "몽고DB는 관계형 DB처럼 색인 사용이 불가능하다.", 'O')
]

# 사용자에게 중간고사 또는 기말고사를 선택하도록 안내
print("중간고사(1) 또는 기말고사(2)를 선택하세요.")
user_choice = input("Enter 1 or 2: ")

if user_choice == '1':
    selected_questions = questions1
elif user_choice == '2':
    selected_questions = questions2
else:
    print("올바른 선택이 아닙니다. 프로그램을 종료합니다.")
    exit()

# 문제 순서 섞기
shuffle_questions(selected_questions)

# 틀린 문제 저장
incorrect_questions = []

# 모든 문제에 대한 퀴즈 실행
for question in selected_questions:
    if not question.ask_question():
        incorrect_questions.append(question)

# 오답 노트 실행
execute_review(incorrect_questions)

# 모든 문제를 맞을 때까지 반복
while incorrect_questions:
    shuffle_questions(selected_questions)  # 기존의 오답을 다시 섞습니다.
    new_incorrect_questions = []
    for question in incorrect_questions:
        if question in selected_questions:  # 기존의 오답을 다시 섞을 때 문제가 있는지 확인합니다.
            if not question.ask_question():
                new_incorrect_questions.append(question)
        else:
            print(f"문제 {question.number}는 유효하지 않습니다.")
    incorrect_questions = new_incorrect_questions

    # 모든 문제를 맞췄다면 종료
    if not incorrect_questions:
        break

# 모든 문제를 맞춘 경우
print("모든 문제를 정답으로 풀었습니다. 프로그램을 종료합니다.")

# 모든 문제를 맞춘 경우
print("모든 문제를 정답으로 풀었습니다. 프로그램을 종료합니다.")
