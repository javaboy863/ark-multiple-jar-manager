# 1.什么是ark-multiple-jar-manager？
ark-multiple-jar-manager是ark系列框架中，负责同一个jar多个版本管理的服务。
# 2.ark-multiple-jar-manager解决了什么问题？
&emsp;&emsp;我们在对接三方时，如美团，饿了么，抖音，微信等，都会遇到这样的场景：这些三方都提供了SDK，当我们依赖他们的SDK后，会发现不同的三方都依赖了同一个jar，
但这同一个jar的版本还不一样，这就导致了我们的服务遇到了jar冲突问题。<br/>
&emsp;&emsp;这时候我们就需要对这些jar进行管理，保证不同的三方SDK可以正常工作，这就是ark-multiple-jar-manager的作用。
# 3.ark-multiple-jar-manager使用场景
- 服务依赖同一个jar，但是不同版本的场景
# 4.ark-multiple-jar-manager如何使用？
参考sdk的util包下的代码，里面对了一些三方SDK提供的函数做了一次封装。