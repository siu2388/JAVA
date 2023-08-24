package com.example;

class MyTv2 {
  private boolean isPowerOn;
  private int channel;
  private int volume;
  private int prevChannel = 0;

  final int MAX_VOLUME = 100;
  final int MIN_VOLUME = 0;
  final int MAX_CHANNEL = 100;
  final int MIN_CHANNEL = 1;

  public void setVolume(int volume) {
    if (volume > MAX_VOLUME || volume < MIN_VOLUME)
      return;
    this.volume = volume;
  }

  public int getVolume() {
    return volume;
  }

  public void setChannel(int channel) {
    if (channel > MAX_CHANNEL || channel < MIN_CHANNEL)
      return;
    int tempChannel = this.channel;
    prevChannel = this.channel; // 현재 채널 이전 채널에 저장하기
    this.channel = channel;
  }

  public int getChannel() {
    Math.random();
    return channel;
  }

  public void getPrevChannel() {
    setChannel(prevChannel);// 현재 채널을 이전 채널로 변경
  }

}

public class Ex7_10 {

  public static void main(String args[]) {
    MyTv2 t = new MyTv2();
    t.setChannel(10);
    System.out.println("CH:" + t.getChannel());
    t.setVolume(20);
    System.out.println("VOL:" + t.getVolume());
  }
}
