from selenium import webdriver
import os
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait as wait
from bs4 import BeautifulSoup
import pandas as pd
print(os.getcwd())
getdriv1='https://sports.news.naver.com/wfootball/schedule/index.nhn?year='
getdriv2='&month='
getdrive3='&category=epl'

month=['01','02','03','04','05','06','07','08','09','10','11','12']
year=['2019','2020','2021']



alpha=['1','2']
driver = webdriver.Chrome('chromedriver.exe')
driver.implicitly_wait(3)

LScore=[]
RScore=[]
l1='//*[@id="_monthlyScheduleList"]/tr[' ##노.가.다.
l2=']/td[2]/div/span['
l3=']/span['
l4=']'
Left=[]
Right=[]
l0=']/td/div/span' ##예외처리 용
for z in year:


        for i in month:      ##편리성을 위해 분리시킴 19/20 두년도 나눔
                print(z+'년'+i+'월')
                driver.get(getdriv1+z+getdriv2+i+getdrive3)
                com1=len(driver.find_elements_by_xpath('//*[@id="_monthlyScheduleList"]/tr'))
                com1+=1
                for k in range(1, com1):          ### 최대값 맞춰서 하면 됨.
                        hd0 = driver.find_element_by_xpath(l1 + str(k) + l0).text
                        if (hd0 == '경기가 없습니다.'):
                                 continue
                        hd1 = driver.find_element_by_xpath(l1 + str(k) + l2 + alpha[0] + l3 + alpha[0] + l4).text
                        hd2 = driver.find_element_by_xpath(l1 + str(k) + l2 + alpha[0] + l3 + alpha[1] + l4).text
                        hd3 = driver.find_element_by_xpath(l1 + str(k) + l2 + alpha[1] + l3 + alpha[0] + l4).text
                        hd4 = driver.find_element_by_xpath(l1 + str(k) + l2 + alpha[1] + l3 + alpha[1] + l4).text
                        if(hd1 and hd2 and hd3 and hd4 == None):
                                break
                        Left.append(hd1)
                        Right.append(hd3)
                        LScore.append(hd2)
                        RScore.append(hd4)
                        print(hd1+' '+hd2+':'+hd3+' '+hd4)
                        if(k==com1):
                                driver.quit()
                                break

                Name4date= z+i
                print(Name4date)
                Df = pd.DataFrame({"Left": Left, "Right": Right, "LScore": LScore, "RScore": RScore})
                Df.to_csv(Name4date, index=False, header=None, sep='\t')
                Left=[]
                Right=[]
                LScore=[]
                RScore=[]