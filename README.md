# i2c
Arduino mega とのI2Cサンプル


## 更新履歴
- 2018年11月12日(月) サンプルプログラム作成

----

# SSH接続について
WidowsではTeraTermをダウンロードしておけば、SSH通信ができます。<br>
また、Cmderでも可能です。好きなターミナルソフトをお使いください。<br>
(LinuxがあればLinuxを使うことを推奨します)

1. ラズパイにLANケーブルと電源を挿したら、管理者権限でターミナルソフトを起動し、`arp -a`を実行してください。<br>
IP Addressとデバイス名の一覧が出るかと思いますので、**Raspberry Pi** と言ったデバイス名があるか探してください。<br>
見つかりましたら、そのIP Addressをコピーなどしておいてください。

2. CmderまたはTeraTermを起動。<br>
Cmderではコマンドで`ssh pi@先程見つけたIP Address`と打ち込んでください。<br>
警告メッセージが出ますが、**yes** と打ち込むとパスワードを聞かれるので、**Rapsberry** と入力すると、sshログインできます。

# サンプルプログラムの動かし方
ArduinoMegaとRaspberry Piとを指定のピンでつなぎ終わったら、sshログインしたターミナルで`sudo i2cdetect -y 1`を実行。<br>
すると、I2Cデバイスのアドレスが出るかと思いますので、確認してください。(プログラムに書いたアドレスと違えば、プログラムの修正をお願いします)<br>

ラズパイの方に本プロジェクトをクローンなりしておき、`sudo java -jar  target/RunSample-jar-with-dependencies.jar` とコマンドを打つことでサンプルプログラムを実行できます。
