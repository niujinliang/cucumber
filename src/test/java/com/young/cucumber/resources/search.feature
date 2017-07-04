Feature: 搜索
Background: 用户在 手机默认浏览器上打开https://m.baidu.com搜索cucumber信息

Scenario: 在百度搜索上搜索cucumber
Given 用户打开https://www.baidu.com/
When 输入关键字：cucumber
Then 搜索结果：cucumber就会显示出来