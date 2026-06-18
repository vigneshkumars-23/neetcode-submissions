class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        # Stack
        st = []
        for num in asteroids:
            if len(st) == 0:
                print("Nothing is in the stack - adding ",num)
                st.append(num)
                continue
            if self.sameSign(st[-1], num) or (num > 0 and st[-1] < 0):
                print("Since it is a same sign just adding it to the stack ",num)
                st.append(num)
            else:
                if abs(num) == abs(st[-1]):
                    print("Both are equal so poping from stack ",st[-1]," not adding anything")
                    st.pop()
                else:
                    equalPop=False
                    append=False
                    while len(st) > 0 and not self.sameSign(st[-1],num):
                        if abs(num) > abs(st[-1]):
                            print(num," > top element ",st[-1]," so popping ",st[-1])
                            st.pop()
                            append=True
                        elif abs(num) == abs(st[-1]):
                            append=False
                            print(num," and stack's top element ",st[-1]," are equal so popping top element and not adding anything")
                            st.pop()
                            break
                        else:
                            print(num, " < stack's top element ",st[-1]," so adding ",num," to the stack")
                            append=False
                            break
                    if append:
                        st.append(num)
        return st

    def sameSign(self, num1: int, num2: int) -> bool:
        if num1*num2 > 0:
            return True
        else:
            return False
        