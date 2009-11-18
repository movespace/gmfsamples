/*
 * Copyright (c) 2009, Jean-Fran�ois Brazeau. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 * 
 *  1. Redistributions of source code must retain the above copyright notice,
 *     this list of conditions and the following disclaimer.
 * 
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 * 
 *  3. The name of the author may not be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIEDWARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS
 * OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE
 * USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package jfb.examples.gmf.filesystem.diagram.part;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class FilesystemLinkDescriptor extends FilesystemNodeDescriptor {

	/**
	 * @generated
	 */
	private EObject mySource;

	/**
	 * @generated
	 */
	private EObject myDestination;

	/**
	 * @generated
	 */
	private IAdaptable mySemanticAdapter;

	/**
	 * @generated
	 */
	private FilesystemLinkDescriptor(EObject source, EObject destination,
			EObject linkElement, int linkVID) {
		super(linkElement, linkVID);
		mySource = source;
		myDestination = destination;
	}

	/**
	 * @generated
	 */
	public FilesystemLinkDescriptor(EObject source, EObject destination,
			IElementType elementType, int linkVID) {
		this(source, destination, (EObject) null, linkVID);
		final IElementType elementTypeCopy = elementType;
		mySemanticAdapter = new IAdaptable() {
			public Object getAdapter(Class adapter) {
				if (IElementType.class.equals(adapter)) {
					return elementTypeCopy;
				}
				return null;
			}
		};
	}

	/**
	 * @generated
	 */
	public FilesystemLinkDescriptor(EObject source, EObject destination,
			EObject linkElement, IElementType elementType, int linkVID) {
		this(source, destination, linkElement, linkVID);
		final IElementType elementTypeCopy = elementType;
		mySemanticAdapter = new EObjectAdapter(linkElement) {
			public Object getAdapter(Class adapter) {
				if (IElementType.class.equals(adapter)) {
					return elementTypeCopy;
				}
				return super.getAdapter(adapter);
			}
		};
	}

	/**
	 * @generated
	 */
	public EObject getSource() {
		return mySource;
	}

	/**
	 * @generated
	 */
	public EObject getDestination() {
		return myDestination;
	}

	/**
	 * @generated
	 */
	public IAdaptable getSemanticAdapter() {
		return mySemanticAdapter;
	}

}
