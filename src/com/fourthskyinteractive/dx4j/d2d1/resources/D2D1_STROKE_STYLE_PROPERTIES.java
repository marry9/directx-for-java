package com.fourthskyinteractive.dx4j.d2d1.resources;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ValuedEnum;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

import com.fourthskyinteractive.dx4j.d2d1.D2D1.D2D1_CAP_STYLE;
import com.fourthskyinteractive.dx4j.d2d1.D2D1.D2D1_DASH_STYLE;
import com.fourthskyinteractive.dx4j.d2d1.D2D1.D2D1_LINE_JOIN;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("d2d1") 
public class D2D1_STROKE_STYLE_PROPERTIES extends StructObject {
	public D2D1_STROKE_STYLE_PROPERTIES() {
		super();
	}
	public D2D1_STROKE_STYLE_PROPERTIES(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
	/// C type : D2D1_CAP_STYLE
	@Field(0) 
	public ValuedEnum<D2D1_CAP_STYLE > startCap() {
		return this.io.getEnumField(this, 0);
	}
	/// C type : D2D1_CAP_STYLE
	@Field(0) 
	public D2D1_STROKE_STYLE_PROPERTIES startCap(ValuedEnum<D2D1_CAP_STYLE > startCap) {
		this.io.setEnumField(this, 0, startCap);
		return this;
	}
	/// C type : D2D1_CAP_STYLE
	@Field(1) 
	public ValuedEnum<D2D1_CAP_STYLE > endCap() {
		return this.io.getEnumField(this, 1);
	}
	/// C type : D2D1_CAP_STYLE
	@Field(1) 
	public D2D1_STROKE_STYLE_PROPERTIES endCap(ValuedEnum<D2D1_CAP_STYLE > endCap) {
		this.io.setEnumField(this, 1, endCap);
		return this;
	}
	/// C type : D2D1_CAP_STYLE
	@Field(2) 
	public ValuedEnum<D2D1_CAP_STYLE > dashCap() {
		return this.io.getEnumField(this, 2);
	}
	/// C type : D2D1_CAP_STYLE
	@Field(2) 
	public D2D1_STROKE_STYLE_PROPERTIES dashCap(ValuedEnum<D2D1_CAP_STYLE > dashCap) {
		this.io.setEnumField(this, 2, dashCap);
		return this;
	}
	/// C type : D2D1_LINE_JOIN
	@Field(3) 
	public ValuedEnum<D2D1_LINE_JOIN > lineJoin() {
		return this.io.getEnumField(this, 3);
	}
	/// C type : D2D1_LINE_JOIN
	@Field(3) 
	public D2D1_STROKE_STYLE_PROPERTIES lineJoin(ValuedEnum<D2D1_LINE_JOIN > lineJoin) {
		this.io.setEnumField(this, 3, lineJoin);
		return this;
	}
	@Field(4) 
	public float miterLimit() {
		return this.io.getFloatField(this, 4);
	}
	@Field(4) 
	public D2D1_STROKE_STYLE_PROPERTIES miterLimit(float miterLimit) {
		this.io.setFloatField(this, 4, miterLimit);
		return this;
	}
	/// C type : D2D1_DASH_STYLE
	@Field(5) 
	public ValuedEnum<D2D1_DASH_STYLE > dashStyle() {
		return this.io.getEnumField(this, 5);
	}
	/// C type : D2D1_DASH_STYLE
	@Field(5) 
	public D2D1_STROKE_STYLE_PROPERTIES dashStyle(ValuedEnum<D2D1_DASH_STYLE > dashStyle) {
		this.io.setEnumField(this, 5, dashStyle);
		return this;
	}
	@Field(6) 
	public float dashOffset() {
		return this.io.getFloatField(this, 6);
	}
	@Field(6) 
	public D2D1_STROKE_STYLE_PROPERTIES dashOffset(float dashOffset) {
		this.io.setFloatField(this, 6, dashOffset);
		return this;
	}
}
