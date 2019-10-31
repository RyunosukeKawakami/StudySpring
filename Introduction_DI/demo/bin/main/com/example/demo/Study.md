# 学習したこと

## @Component
beanとしてDIコンテナに登録するクラスに付与する。
機能としては*Repository*/*Service*/*Controller*と同じである。

## @AutoWired
インスタンスを代入するプロパティに付与。
@Component、@ServiceなどDIコンテナに登録されたクラスから
インジェクションできるインスタンスを自動的にインジェクションする。

## 用語

- byType
  型を見てインジェクションする方法