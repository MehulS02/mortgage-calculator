{\rtf1\ansi\ansicpg1252\cocoartf2709
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.text.NumberFormat;\
import java.util.Scanner;\
\
public class Main \{\
\
    public static void main(String[] args) \{\
	    final byte MONTHS_IN_YEAR=12;\
	    final byte PERCENT=100;\
\
	    Scanner scanner=new Scanner(System.in);\
\
        System.out.println("Principal :: ");\
        int principal=scanner.nextInt();\
\
        System.out.println("Annual Interest Rate :: ");\
        float annualInterest=scanner.nextFloat();\
        float monthlyInterest=annualInterest/PERCENT/MONTHS_IN_YEAR;\
\
        System.out.println("Period (Years) :: ");\
        byte years= scanner.nextByte();\
        int numberOfPayments=years*MONTHS_IN_YEAR;\
\
        double mortgage=principal* (monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments)\
                /(Math.pow(1+monthlyInterest, numberOfPayments)-1));\
\
        String mortgageFormatted=NumberFormat.getCurrencyInstance().format(mortgage);\
        System.out.println("Mortgage :: "+mortgageFormatted);\
    \}\
\}}