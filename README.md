# Learn Android Architecture Blueprints

学习 Android architecture blueprints.

https://github.com/googlesamples/android-architecture



##### src 添加 mock 文件夹

![1527299968343](../../LIJIAN~1/AppData/Local/Temp/1527299968343.png)

直接添加文件夹`app\src\mock\java\co\lijian\todoapp`, rebuild, 失败！

**总结**

1. 添加文件夹`app\src\mock\java\co\lijian\todoapp`,

2. app/build.gradle 中添加如下代码

   ```
      // 添加 mock
       flavorDimensions "default"
       // If you need to add more flavors, consider using flavor dimensions.
       productFlavors {
           mock {
               dimension "default"
               applicationIdSuffix = ".mock"
           }
           prod {
               dimension "default"
           }
       }
       // Remove mockRelease as it's not needed.
       android.variantFilter { variant ->
           if (variant.buildType.name == 'release'
                   && variant.getFlavors().get(0).name == 'mock') {
               variant.setIgnore(true)
           }
       }
   ```

   