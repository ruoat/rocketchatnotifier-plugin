<a name=""></a>
# [](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v1.1.2...v) (2018-02-15)


### Bug Fixes

* **proxy-error:** Resolve #JENKINS-47858 ([074a5e0](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/074a5e0)), closes [#JENKINS-47858](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-47858)
* **use-defaults:** applying global defaults ([4a8bdf7](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/4a8bdf7)), closes [#JENKINS-48486](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-48486)
* **use-defaults:** applying global defaults ([673b6ea](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/673b6ea)), closes [#JENKINS-48486](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-48486)



<a name="1.1.2"></a>
## [1.1.2](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v1.1.1...v1.1.2) (2018-01-25)


### Bug Fixes

* **JSON:** Corrected form data usage ([JENKINS-47858](https://issues.jenkins-ci.org/browse/JENKINS-47858)) ([2781961](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/2781961))



<a name="1.1.1"></a>
## [1.1.1](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v1.1.0...v1.1.1) (2018-01-10)


### Bug Fixes

* **NPE:** Fix typo (see #https://issues.jenkins-ci.org/browse/JENKINS-48185) ([52c57a3](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/52c57a3))
* **NPE:** Resolve null pointer issue (see #https://issues.jenkins-ci.org/browse/JENKINS-48185) ([dd53f96](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/dd53f96))
* **proxy-config:** Refactor proxy config ([9d28f53](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/9d28f53))



<a name="1.0.0"></a>
# [1.0.0](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v0.5.5...v1.0.0) (2017-11-15)


### Bug Fixes

* **duration-display:** Fix for duration label error ([28c8594](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/28c8594))
* **error-handling:** Improved error handling for special characters in fields (see #JENKINS-47858) ([2a3a542](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/2a3a542)), closes [#JENKINS-47858](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-47858)
* **NPE:** Resolve null pointer in error log ([94b7308](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/94b7308)), closes [#JENKINS-47841](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-47841)


### Features

* **coverage:** Adding code coverage ([dfe4b4e](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/dfe4b4e))



<a name="0.5.3"></a>
## [0.5.3](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v0.5.2...v0.5.3) (2017-09-13)


### Features

* **drop-old-rocket-api:** Drop support for older rocket.chat versions ([40dad98](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/40dad98))



<a name="0.5.2"></a>
## [0.5.2](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v0.5.1...v0.5.2) (2017-07-13)



<a name="0.5.1"></a>
## [0.5.1](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v0.5.0...v0.5.1) (2017-06-02)


### Bug Fixes

* **message-label:** Corrected message label ([451b497](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/451b497))



<a name="0.5.0"></a>
# [0.5.0](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v0.4.4...v0.5.0) (2017-02-10)


### Bug Fixes

* **NPE:** Corrected NPE error. ([583b847](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/583b847)), closes [#JENKINS-41436](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-41436)
* **status-msg:** Corrected status message ([724c625](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/724c625)), closes [#JENKINS-41680](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-41680)


### Features

* add the posibility to send attachments. ([c56748e](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/c56748e))



<a name="0.4.4"></a>
## [0.4.4](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v0.4.1...v0.4.4) (2016-12-30)


### Bug Fixes

* **build:** Use name for plugin ([e99f771](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/e99f771))
* **dependencies:** resolve classpath error ([c88cb48](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/c88cb48))
* **docker-tests:** Fix docker setup (see #JENKINS-40673) ([52c6316](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/52c6316)), closes [#JENKINS-40673](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40673)
* **findbugs:** resolve findbugs error ([c972250](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/c972250))


### Features

* **new-rocket-api:** first basic implementation (see #JENKINS-40595) ([ebb346e](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/ebb346e)), closes [#JENKINS-40595](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40595)
* **new-rocket-api:** Implement message sending (see #JENKINS-40595) ([162812b](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/162812b)), closes [#JENKINS-40595](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40595)
* **new-rocket-api:** Let integration tests respect RocketChat version (see #JENKINS-40595 and #JENKINS-40673) ([603e6af](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/603e6af)), closes [#JENKINS-40595](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40595) [#JENKINS-40673](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40673)
* **new-rocket-api:** Let integration tests respect RocketChat version (see #JENKINS-40595 and #JENKINS-40673) ([aa9614f](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/aa9614f)), closes [#JENKINS-40595](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40595) [#JENKINS-40673](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40673)
* **new-rocket-api:** Run tests against multiple rocketchat versions (see #JENKINS-40595 and #JENKINS-40673) ([0cd495d](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/0cd495d)), closes [#JENKINS-40595](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40595) [#JENKINS-40673](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40673)
* **new-rocket-api:** Support old legacy API, too (see #JENKINS-40595) ([08d8b42](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/08d8b42)), closes [#JENKINS-40595](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40595)
* **new-rocket-api:** Use docker tests in Travis Build (see #JENKINS-40595 and #JENKINS-40673) ([e477881](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/e477881)), closes [#JENKINS-40595](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40595) [#JENKINS-40673](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40673)
* **testing:** Implement basic integration test (see #JENKINS-40673) ([01c249d](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/01c249d)), closes [#JENKINS-40673](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40673)



<a name="0.3.0"></a>
# [0.3.0](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v0.2.1...v0.3.0) (2016-12-09)


### Bug Fixes

* **error_handling:** Improved error handling ([4c51838](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/4c51838))


### Features

* **debugging:** Improved logging ([87f2d71](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/87f2d71))



<a name="0.2.1"></a>
## [0.2.1](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v0.1.2...v0.2.1) (2016-09-27)



<a name="0.1.2"></a>
## [0.1.2](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v0.2.0...v0.1.2) (2016-09-16)



<a name="0.2.0"></a>
# 0.2.0 (2016-09-16)



