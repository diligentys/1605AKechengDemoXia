package com.example.meiketangxiangmuapp;


import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.mImg1)
    ImageView mImg1;
    @InjectView(R.id.mImg2)
    ImageView mImg2;
    @InjectView(R.id.mBtn)
    Button mBtn;
    @InjectView(R.id.aihao1)
    ImageView aihao1;
    @InjectView(R.id.aihao2)
    ImageView aihao2;
    @InjectView(R.id.aihao3)
    ImageView aihao3;
    @InjectView(R.id.aihao4)
    ImageView aihao4;
    @InjectView(R.id.meiye1)
    ImageView meiye1;
    @InjectView(R.id.meiye2)
    ImageView meiye2;
    @InjectView(R.id.meiye3)
    ImageView meiye3;
    @InjectView(R.id.kaiqi)
    ImageView kaiqi;
    @InjectView(R.id.cxz1)
    ImageView cxz1;
    @InjectView(R.id.cxz2)
    ImageView cxz2;
    @InjectView(R.id.cxz3)
    ImageView cxz3;
    @InjectView(R.id.cxz4)
    ImageView cxz4;
    @InjectView(R.id.cxz5)
    ImageView cxz5;
    private int height;
    private int width;
    boolean isf1 = true;
    boolean isf2 = true;
    boolean isf3 = true;
    boolean isf = true;
    ArrayList<String> strings = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        WindowManager manager = (WindowManager) MainActivity.this.getSystemService(this.WINDOW_SERVICE);
        height = manager.getDefaultDisplay().getHeight();
        width = manager.getDefaultDisplay().getWidth();
        GoneAiHao();
        ChuxuezheYincang();
        Gonemeiye();
        kaiqi.setVisibility(View.GONE);

    }

    //TODO
    @OnClick({R.id.mImg1, R.id.mImg2, R.id.aihao1, R.id.aihao2, R.id.aihao3, R.id.aihao4, R.id.kaiqi,
            R.id.cxz1, R.id.cxz2, R.id.cxz3, R.id.cxz4, R.id.cxz5, R.id.meiye2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.meiye2:
                mImg1.setVisibility(View.GONE);
                mBtn.setEnabled(false);
                ObjectAnimator translationY = DH(view, "translationY", height / 4, 0, 1000);
                translationY.addListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ChuxuezheXianshi();
                        //TODO   显示位移
                        tran(cxz1, "translationX", 0, width / 3, 1000);
                        tran(cxz2, "translationX", 0, -width / 3, 1000);

                        tran(cxz1, "translationY", 0, -height / 10, 1000);
                        tran(cxz2, "translationY", 0, -height / 10, 1000);


                        tran(cxz4, "translationY", 0, -height / 4, 1000);

                        tran(cxz3, "translationY", 0, -height / 5, 1000);
                        tran(cxz3, "translationX", 0, -width / 5, 1000);

                        tran(cxz5, "translationX", 0, width / 5, 1000);
                        ObjectAnimator translationY1 = tran(cxz5, "translationY", 0, -height / 5, 1000);
                        translationY1.addListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animator) {

                            }

                            @Override
                            public void onAnimationEnd(Animator animator) {
                                mBtn.setEnabled(true);
                            }

                            @Override
                            public void onAnimationCancel(Animator animator) {

                            }

                            @Override
                            public void onAnimationRepeat(Animator animator) {

                            }
                        });

                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                });
                break;

            case R.id.mImg1:
                mBtn.setEnabled(false);
                ObjectAnimator aaa = Left(mImg1);
                aaa.addListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        initmeiye();
                        DH(meiye1, "translationY", 0, height / 4, 1000);
                        DH(meiye3, "translationY", 0, height / 4, 1000);
                        DH(meiye3, "translationX", 0, width / 4, 1000);
                        DH(meiye2, "translationY", 0, height / 4, 1000);
                        ObjectAnimator translationX = DH(meiye1, "translationX", 0, -width / 4, 1000);
                        translationX.addListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animator) {

                            }

                            @Override
                            public void onAnimationEnd(Animator animator) {
                                mBtn.setEnabled(true);

                            }

                            @Override
                            public void onAnimationCancel(Animator animator) {

                            }

                            @Override
                            public void onAnimationRepeat(Animator animator) {

                            }
                        });

                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                });
                Right(mImg2);
                touming(mImg2, 1, 0, 1000);
                jiaodian(false);
                break;
            case R.id.mImg2:
                mBtn.setEnabled(false);
                ObjectAnimator bbb = Right(mImg2);
                bbb.addListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        initAiHao();
                        DH(aihao1, "translationX", 0, width / 3, 1000);
                        DH(aihao2, "translationX", 0, -width / 3, 1000);
                        DH(aihao1, "translationY", 0, -height / 8, 1000);
                        DH(aihao2, "translationY", 0, -height / 8, 1000);
                        DH(aihao3, "translationX", 0, -width / 6, 1000);
                        DH(aihao3, "translationY", 0, -height / 4, 1000);
                        DH(aihao4, "translationX", 0, width / 6, 1000);
                        ObjectAnimator translationY = DH(aihao4, "translationY", 0, -height / 4, 1000);
                        translationY.addListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animator) {

                            }

                            @Override
                            public void onAnimationEnd(Animator animator) {
                                mBtn.setEnabled(true);
                                kaiqi.setVisibility(View.VISIBLE);
                            }

                            @Override
                            public void onAnimationCancel(Animator animator) {

                            }

                            @Override
                            public void onAnimationRepeat(Animator animator) {

                            }
                        });

                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                });
                Left(mImg1);
                touming(mImg1, 1, 0, 1000);
                jiaodian(false);
                break;

            case R.id.aihao1:
                if (isf) {
                    aihao1.setImageResource(R.mipmap.sh1);
                    isf = false;
                } else {
                    aihao1.setImageResource(R.mipmap.aihao1);
                    isf = true;
                }
                break;
            case R.id.aihao2:
                if (isf1) {
                    aihao2.setImageResource(R.mipmap.sh2);
                    isf1 = false;
                } else {
                    aihao2.setImageResource(R.mipmap.aihao2);
                    isf1 = true;
                }
                break;
            case R.id.aihao3:
                if (isf2) {
                    aihao3.setImageResource(R.mipmap.sh3);
                    isf2 = false;
                } else {
                    aihao3.setImageResource(R.mipmap.aihao3);
                    isf2 = true;
                }
                break;
            case R.id.aihao4:
                if (isf3) {
                    aihao4.setImageResource(R.mipmap.sh4);
                    isf3 = false;
                } else {
                    aihao4.setImageResource(R.mipmap.aihao4);
                    isf3 = true;
                }
                break;
            case R.id.kaiqi:

                if (!isf) {
                    strings.add("生活休闲");
                }
                if (!isf1) {
                    strings.add("塑性与养生");
                }
                if (!isf2) {
                    strings.add("职场精英");
                }
                if (!isf3) {
                    strings.add("主题活动");
                }
                Intent intent = new Intent(MainActivity.this, BActivity.class);
                intent.putStringArrayListExtra("list", strings);
                startActivity(intent);
                strings.clear();
                break;
        }
    }

    @OnClick(R.id.mBtn)
    public void onViewClicked() {
        jiaodian(true);
        ee(mImg1);
        ee(mImg2);
        touming(mImg1, 0.5f, 1, 0);
        touming(mImg2, 0.5f, 1, 0);
        GoneAiHao();
        kaiqi.setVisibility(View.GONE);
        ChuxuezheYincang();
        Gonemeiye();
        mImg1.setVisibility(View.VISIBLE);
    }

    //平移方法

    private ObjectAnimator tran(View view, String type, int from, int to, int time) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, type, from, to);
        animator.setDuration(time)
                .start();
        return animator;
    }

    //左往右
    private ObjectAnimator Left(View view) {
        ObjectAnimator animator = new ObjectAnimator().ofFloat(view, "translationX", 0, width / 2 - mImg2.getWidth() / 2);
        animator.setDuration(1000).start();
        return animator;
    }

    //右往左
    private ObjectAnimator Right(View view) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "translationX", -(width / 2 - mImg2.getWidth() / 2));
        animator.setDuration(1000).start();
        return animator;
    }

    //透明
    private void touming(View view, float a, float b, int time) {
        ObjectAnimator.ofFloat(view, "alpha", a, b)
                .setDuration(time)
                .start();
    }

    //返回之前位置
    private void ee(View view) {
        ObjectAnimator.ofFloat(view, "translationX", 0, 0)
                .setDuration(1000)
                .start();
    }


    //禁用焦点
    private void jiaodian(boolean bbbb) {
        mImg1.setEnabled(bbbb);
        mImg2.setEnabled(bbbb);
    }

    //隐藏爱好弹出imageview
    private void GoneAiHao() {
        aihao1.setVisibility(View.GONE);
        aihao2.setVisibility(View.GONE);
        aihao3.setVisibility(View.GONE);
        aihao4.setVisibility(View.GONE);
    }

    //显示爱好弹出imageview
    private void initAiHao() {
        aihao1.setVisibility(View.VISIBLE);
        aihao2.setVisibility(View.VISIBLE);
        aihao3.setVisibility(View.VISIBLE);
        aihao4.setVisibility(View.VISIBLE);
    }

    //隐藏美业imageview

    private void Gonemeiye() {
        meiye1.setVisibility(View.GONE);
        meiye2.setVisibility(View.GONE);
        meiye3.setVisibility(View.GONE);
    }

    //显示
    private void initmeiye() {
        meiye1.setVisibility(View.VISIBLE);
        meiye2.setVisibility(View.VISIBLE);
        meiye3.setVisibility(View.VISIBLE);
    }

    private void ChuxuezheXianshi() {
        cxz1.setVisibility(View.VISIBLE);
        cxz2.setVisibility(View.VISIBLE);
        cxz3.setVisibility(View.VISIBLE);
        cxz4.setVisibility(View.VISIBLE);
        cxz5.setVisibility(View.VISIBLE);
    }

    private void ChuxuezheYincang() {
        cxz1.setVisibility(View.GONE);
        cxz2.setVisibility(View.GONE);
        cxz3.setVisibility(View.GONE);
        cxz4.setVisibility(View.GONE);
        cxz5.setVisibility(View.GONE);
    }

    private ObjectAnimator DH(View view, String a, float b, float c, int d) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, a, b, c);
        animator.setDuration(d).start();
        return animator;
    }

}
