import { Suspense } from "react";
import Data from "../ui/Data";

export default async function Page() {
    
    return (
        <div>
            <Suspense fallback={<h1>Loading...</h1>}>
                <Data time={10000}></Data>
            </Suspense>
            <Suspense fallback={<h1>Loading...</h1>}>
                <Data time={2000}></Data>
            </Suspense>
            <Suspense fallback={<h1>Loading...</h1>}>
                <Data time={3000}></Data>
            </Suspense>
            <Suspense fallback={<h1>Loading...</h1>}>
                <Data time={0}></Data>
            </Suspense>
        </div>
    )
}