package com.map.wrappers.proxy;

import java.io.IOException;

class GifProxy implements Imagem {
	
	Gif gif;
    Cabecalho cabecalho;
    Path path;
    
    GifProxy(Path path, Cabecalho cabecalho) {
        super();
        this.path = path;
        this.cabecalho = cabecalho;
    }

    @Override
    public short altura() {
        return this.cabecalho.altura();
    }

    @Override
    public short largura() {
        return this.cabecalho.largura();
    }

    @Override
    public String getTipo() {
        return this.path.getTipo();
    }

	@Override
	public void draw() throws IOException {
		this.gif.draw();
	}

	@Override
	public byte[][] content() throws IOException {
		return this.gif.content();
	}
}