package com.fourthskyinteractive.dx4j.dxgi.device;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ValuedEnum;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

import com.fourthskyinteractive.dx4j.dxgi.DXGI.DXGI_ALPHA_MODE;
import com.fourthskyinteractive.dx4j.dxgi.DXGI.DXGI_FORMAT;
import com.fourthskyinteractive.dx4j.dxgi.DXGI.DXGI_SCALING;
import com.fourthskyinteractive.dx4j.dxgi.DXGI.DXGI_SWAP_EFFECT;
import com.fourthskyinteractive.dx4j.dxgi.DXGI.DXGI_USAGE;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("dxgi") 
public class DXGI_SWAP_CHAIN_DESC1 extends StructObject {
	public DXGI_SWAP_CHAIN_DESC1() {
		super();
	}
	public DXGI_SWAP_CHAIN_DESC1(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
	@Field(0) 
	public int Width() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public DXGI_SWAP_CHAIN_DESC1 Width(int value) {
		this.io.setIntField(this, 0, value);
		return this;
	}
	
	@Field(1) 
	public int Height() {
		return this.io.getIntField(this, 1);
	}
	@Field(1) 
	public DXGI_SWAP_CHAIN_DESC1 Height(int value) {
		this.io.setIntField(this, 1, value);
		return this;
	}
	
	@Field(2) 
	public ValuedEnum<DXGI_FORMAT> Format() {
		return this.io.getEnumField(this, 2);
	}
	@Field(2) 
	public DXGI_SWAP_CHAIN_DESC1 Format(ValuedEnum<DXGI_FORMAT> value) {
		this.io.setEnumField(this, 2, value);
		return this;
	}
	
	@Field(3) 
	public int Stereo() {
		return this.io.getIntField(this, 3);
	}
	@Field(3) 
	public DXGI_SWAP_CHAIN_DESC1 Stereo(int value) {
		this.io.setIntField(this, 3, value);
		return this;
	}
	
	/// C type : DXGI_SAMPLE_DESC
	@Field(4) 
	public DXGI_SAMPLE_DESC SampleDesc() {
		return this.io.getNativeObjectField(this, 4);
	}
	
	@Field(5)
	public ValuedEnum<DXGI_USAGE> BufferUsage() {
		return this.io.getEnumField(this, 5);
	}
	@Field(5) 
	public DXGI_SWAP_CHAIN_DESC1 BufferUsage(DXGI_USAGE BufferUsage) {
		this.io.setEnumField(this, 5, BufferUsage);
		return this;
	}
	
	@Field(6) 
	public int BufferCount() {
		return this.io.getIntField(this, 6);
	}
	@Field(6) 
	public DXGI_SWAP_CHAIN_DESC1 BufferCount(int BufferCount) {
		this.io.setIntField(this, 6, BufferCount);
		return this;
	}
	
	@Field(7) 
	public ValuedEnum<DXGI_SCALING> Scaling() {
		return this.io.getEnumField(this, 7);
	}
	@Field(7) 
	public DXGI_SWAP_CHAIN_DESC1 Scaling(ValuedEnum<DXGI_SCALING> value) {
		this.io.setEnumField(this, 7, value);
		return this;
	}
	
	@Field(8) 
	public ValuedEnum<DXGI_SWAP_EFFECT> SwapEffect() {
		return this.io.getEnumField(this, 8);
	}
	@Field(8) 
	public DXGI_SWAP_CHAIN_DESC1 SwapEffect(ValuedEnum<DXGI_SWAP_EFFECT> value) {
		this.io.setEnumField(this, 8, value);
		return this;
	}
	
	@Field(9) 
	public ValuedEnum<DXGI_ALPHA_MODE> AlphaMode() {
		return this.io.getEnumField(this, 9);
	}
	@Field(9) 
	public DXGI_SWAP_CHAIN_DESC1 AlphaMode(ValuedEnum<DXGI_ALPHA_MODE> value) {
		this.io.setEnumField(this, 9, value);
		return this;
	}
	
	@Field(10) 
	public int Flags() {
		return this.io.getIntField(this, 10);
	}
	@Field(10) 
	public DXGI_SWAP_CHAIN_DESC1 Flags(int Flags) {
		this.io.setIntField(this, 10, Flags);
		return this;
	}
}
