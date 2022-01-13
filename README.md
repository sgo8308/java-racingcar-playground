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

---
### 구현할 기능 목록
 - [ ] 자동차 이름 입력 받기
   - 쉼표에 따라 자동차 이름 구분하기
   - 5자를 초과하는 자동차 이름은 예외 던지기
 - [ ] 시도 횟수 입력 받기
 - [ ] 자동차 전진하기
   - 자동차 위치 출력하기
 - [ ] 최종 우승자 구하기
   - 최종 우승자 출력하기
 - [ ] 전체적인 게임 진행하기

### 객체 설계

- Car : 자동차를 움직이는 책임
- Cars : 자동차 전체를 움직이는 책임
- CarNames : 자동차를 만드는 책임
- RacingService : 레이싱을 진행하는 책임
- OutputView : 출력 책임
- InputView : 입력 책임
- Application : 게임 전체적인 진행에 대한 책임