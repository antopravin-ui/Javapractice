
library(readxl)

webdata <- read_excel("C:/Anto/Data Science/Problems/03Web Data Analysis/1555058318_internet_dataset.xlsx")

View(webdata)

str(webdata)

summary(webdata)
webdata$Continent <- as.factor(webdata$Continent)
webdata$Sourcegroup <- as.factor(webdata$Sourcegroup)
summary(webdata)

cor(webdata$Uniquepageviews,webdata$Visits)

Uniquepageviewsano <- aov(Uniquepageviews~Visits, data =webdata )
summary(Uniquepageviewsano)

Exitsano <-aov(Exits~.,data = webdata)
summary(Exitsano)

cor(webdata$Exits,webdata$Bounces)
cor(webdata$Exits,webdata$Uniquepageviews)
cor(webdata$Exits,webdata$Timeinpage)
cor(webdata$Exits,webdata$Visits)

Timeinpageano <-aov(Timeinpage~.,data = webdata)
summary(Timeinpageano)

Bouncesano <-aov(Bounces~.,data = webdata)
summary(Bouncesano)

webdata$Bounces <- webdata$Bounces * 0.01
View(webdata)

rmm<-glm(Bounces~Timeinpage+Continent+Exits+Sourcegroup+Uniquepageviews+Visits,data = webdata,family = "binomial")

summary(rmm)

