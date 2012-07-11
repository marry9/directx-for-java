package com.fourthskyinteractive.dx4j.d3d11.query;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("d3d11") 
public class D3D11_QUERY_DATA_PIPELINE_STATISTICS extends StructObject {
	public D3D11_QUERY_DATA_PIPELINE_STATISTICS() {
		super();
	}
	public D3D11_QUERY_DATA_PIPELINE_STATISTICS(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
	/// C type : UINT64
	@Field(0) 
	public long IAVertices() {
		return this.io.getLongField(this, 0);
	}
	/// C type : UINT64
	@Field(0) 
	public D3D11_QUERY_DATA_PIPELINE_STATISTICS IAVertices(long IAVertices) {
		this.io.setLongField(this, 0, IAVertices);
		return this;
	}
	/// C type : UINT64
	@Field(1) 
	public long IAPrimitives() {
		return this.io.getLongField(this, 1);
	}
	/// C type : UINT64
	@Field(1) 
	public D3D11_QUERY_DATA_PIPELINE_STATISTICS IAPrimitives(long IAPrimitives) {
		this.io.setLongField(this, 1, IAPrimitives);
		return this;
	}
	/// C type : UINT64
	@Field(2) 
	public long VSInvocations() {
		return this.io.getLongField(this, 2);
	}
	/// C type : UINT64
	@Field(2) 
	public D3D11_QUERY_DATA_PIPELINE_STATISTICS VSInvocations(long VSInvocations) {
		this.io.setLongField(this, 2, VSInvocations);
		return this;
	}
	/// C type : UINT64
	@Field(3) 
	public long GSInvocations() {
		return this.io.getLongField(this, 3);
	}
	/// C type : UINT64
	@Field(3) 
	public D3D11_QUERY_DATA_PIPELINE_STATISTICS GSInvocations(long GSInvocations) {
		this.io.setLongField(this, 3, GSInvocations);
		return this;
	}
	/// C type : UINT64
	@Field(4) 
	public long GSPrimitives() {
		return this.io.getLongField(this, 4);
	}
	/// C type : UINT64
	@Field(4) 
	public D3D11_QUERY_DATA_PIPELINE_STATISTICS GSPrimitives(long GSPrimitives) {
		this.io.setLongField(this, 4, GSPrimitives);
		return this;
	}
	/// C type : UINT64
	@Field(5) 
	public long CInvocations() {
		return this.io.getLongField(this, 5);
	}
	/// C type : UINT64
	@Field(5) 
	public D3D11_QUERY_DATA_PIPELINE_STATISTICS CInvocations(long CInvocations) {
		this.io.setLongField(this, 5, CInvocations);
		return this;
	}
	/// C type : UINT64
	@Field(6) 
	public long CPrimitives() {
		return this.io.getLongField(this, 6);
	}
	/// C type : UINT64
	@Field(6) 
	public D3D11_QUERY_DATA_PIPELINE_STATISTICS CPrimitives(long CPrimitives) {
		this.io.setLongField(this, 6, CPrimitives);
		return this;
	}
	/// C type : UINT64
	@Field(7) 
	public long PSInvocations() {
		return this.io.getLongField(this, 7);
	}
	/// C type : UINT64
	@Field(7) 
	public D3D11_QUERY_DATA_PIPELINE_STATISTICS PSInvocations(long PSInvocations) {
		this.io.setLongField(this, 7, PSInvocations);
		return this;
	}
	/// C type : UINT64
	@Field(8) 
	public long HSInvocations() {
		return this.io.getLongField(this, 8);
	}
	/// C type : UINT64
	@Field(8) 
	public D3D11_QUERY_DATA_PIPELINE_STATISTICS HSInvocations(long HSInvocations) {
		this.io.setLongField(this, 8, HSInvocations);
		return this;
	}
	/// C type : UINT64
	@Field(9) 
	public long DSInvocations() {
		return this.io.getLongField(this, 9);
	}
	/// C type : UINT64
	@Field(9) 
	public D3D11_QUERY_DATA_PIPELINE_STATISTICS DSInvocations(long DSInvocations) {
		this.io.setLongField(this, 9, DSInvocations);
		return this;
	}
	/// C type : UINT64
	@Field(10) 
	public long CSInvocations() {
		return this.io.getLongField(this, 10);
	}
	/// C type : UINT64
	@Field(10) 
	public D3D11_QUERY_DATA_PIPELINE_STATISTICS CSInvocations(long CSInvocations) {
		this.io.setLongField(this, 10, CSInvocations);
		return this;
	}
}
