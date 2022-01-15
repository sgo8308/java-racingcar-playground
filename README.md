## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

4. 기능 목록

Controller

- 모델과 뷰를 이용해서 Application을 진행한다.

Model(Domain)

- 레이싱을 진행한다.
    - 자동차들을 준비한다.
        - 자동차들의 이름을 구한다.
            - 쉼표를 기준으로 자동차 이름을 자른다.
            - 자동차의 이름을 생성한다.
        - 자동차들을 생성한다.
            - 자동차를 생성한다.
    - 규칙대로 자동차들을 움직인다.
        - 랜덤 값을 생성한다.
        - 자동차를 움직인다.
- 레이싱의 결과를 구한다.
    - 최종 우승자들을 구한다.
        - 가장 멀리 있는 자동차들을 구한다.

View

- 자동차 이름을 입력받는다.
- 레이싱 횟수를 입력받는다.
- 자동차의 이름과 위치를 출력한다.
- 최종 우승자를 출력한다.