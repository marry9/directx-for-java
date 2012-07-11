package com.fourthskyinteractive.dx4j.d3d9.query;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("d3d9") 
public class D3DDEVINFO_D3D9CACHEUTILIZATION extends StructObject {
	public D3DDEVINFO_D3D9CACHEUTILIZATION() {
		super();
	}
	public D3DDEVINFO_D3D9CACHEUTILIZATION(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
	@Field(0) 
	public float TextureCacheHitRate() {
		return this.io.getFloatField(this, 0);
	}
	@Field(0) 
	public D3DDEVINFO_D3D9CACHEUTILIZATION TextureCacheHitRate(float TextureCacheHitRate) {
		this.io.setFloatField(this, 0, TextureCacheHitRate);
		return this;
	}
	@Field(1) 
	public float PostTransformVertexCacheHitRate() {
		return this.io.getFloatField(this, 1);
	}
	@Field(1) 
	public D3DDEVINFO_D3D9CACHEUTILIZATION PostTransformVertexCacheHitRate(float PostTransformVertexCacheHitRate) {
		this.io.setFloatField(this, 1, PostTransformVertexCacheHitRate);
		return this;
	}
}
