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

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;

/**
 * @generated
 */
public class FilesystemDiagramUpdateCommand implements IHandler {

	/**
	 * @generated
	 */
	public void addHandlerListener(IHandlerListener handlerListener) {
	}

	/**
	 * @generated
	 */
	public void dispose() {
	}

	/**
	 * @generated
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getSelectionService()
				.getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() != 1) {
				return null;
			}
			if (structuredSelection.getFirstElement() instanceof EditPart
					&& ((EditPart) structuredSelection.getFirstElement())
							.getModel() instanceof View) {
				EObject modelElement = ((View) ((EditPart) structuredSelection
						.getFirstElement()).getModel()).getElement();
				List editPolicies = CanonicalEditPolicy
						.getRegisteredEditPolicies(modelElement);
				for (Iterator it = editPolicies.iterator(); it.hasNext();) {
					CanonicalEditPolicy nextEditPolicy = (CanonicalEditPolicy) it
							.next();
					nextEditPolicy.refresh();
				}

			}
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean isEnabled() {
		return true;
	}

	/**
	 * @generated
	 */
	public boolean isHandled() {
		return true;
	}

	/**
	 * @generated
	 */
	public void removeHandlerListener(IHandlerListener handlerListener) {
	}

}
