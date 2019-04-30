## How to Start

前提：Gradleをインストール済みであること。

gradle bootRun

## コーディング規約

Eclipseに以下設定して自動整形する

・GoogleStyleGuideのインポート

　プロジェクトの右クリック　ー＞　Javaコード・スタイル　ー＞　フォーマッター

　→　インポートから [dev/eclipse-java-google-style.xml]を選択

・自動整形

　プロジェクトの右クリック　ー＞　Javaエディタ　ー＞　保存アクション

　→　保存時に選択したアクションを実行にチェックを入れる

## 以前のアプリからの改善ポイント

・application.properyでDomaの命名の設定をしている

・@ConfigAutowireableで前にあった独自アノテーション廃止

・＠EntityクラスにLombokのGetterとSetter入れることでFormatクラス不要にした

・DomaのSQLをresource配下におくことで、コンパイルエラー解消











